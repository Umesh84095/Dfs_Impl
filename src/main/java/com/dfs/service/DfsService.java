package com.dfs.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class DfsService {
    private static final int GRID_SIZE = 20;

    public List<int[]> dfsPath(int startX1, int startY1, int endX1, int endY1) {
        boolean[][] vis = new boolean[GRID_SIZE][GRID_SIZE];
        List<int[]> path = new ArrayList<>();

        if (dfs(startX1, startY1, endX1, endY1, path, vis)) {
            return path;
        } else {
            return new ArrayList<>();
        }
    }

    private boolean dfs(int x, int y, int endX, int endY, List<int[]> path, boolean[][] vis) {
        if (x < 0 || y < 0 || x >= GRID_SIZE || y >= GRID_SIZE || vis[x][y]) {
            return false;
        }

        path.add(new int[]{x, y});
        vis[x][y] = true;

        if (x == endX && y == endY) {
            return true;
        }

        int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

        for (int[] dir : directions) {
            if (dfs(x + dir[0], y + dir[1], endX, endY, path, vis)) {
                return true;
            }
        }

        path.remove(path.size() - 1);
        return false;
    }
}

package com.dfs.controller;

import com.dfs.dto.DfsPathDto;
import com.dfs.service.DfsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class DfsPathController {
    @Autowired
    private DfsService service;
    @PostMapping("/find-path")
    public List<int []> dfsPath(@RequestBody DfsPathDto dto){
        return service.dfsPath(dto.getStartX1(), dto.getStartY1(), dto.getEndX1(),dto.getEndY1());
    }
}

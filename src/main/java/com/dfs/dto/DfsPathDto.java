package com.dfs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DfsPathDto {
   private int startX1;

   public int getStartX1() {
      return startX1;
   }

   public int getStartY1() {
      return startY1;
   }

   public void setStartX1(int startX1) {
      this.startX1 = startX1;
   }

   public void setStartY1(int startY1) {
      this.startY1 = startY1;
   }

   public void setEndX1(int endX1) {
      this.endX1 = endX1;
   }

   public void setEndY1(int endY1) {
      this.endY1 = endY1;
   }

   public int getEndX1() {
      return endX1;
   }

   public int getEndY1() {
      return endY1;
   }

   private int startY1;
   private int endX1;
   private int endY1;
}

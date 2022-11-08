package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] spiral = new int[rows][columns];
        int fill = 1;

        int start = 0;
        int finishColumn = columns - 1;
        int finishRow = rows - 1;
        boolean done = false;

        outer:  while (!done) {
            for (int i = start; i < columns; i++) {
                spiral[start][i] = fill;
                fill++;
            }
            checker: for (int[] row : spiral) {
                for (int column : row) {
                    if(column != 0) {
                        done = true;
                    } else {
                        done = false;
                        break checker;
                    }
                }
            }
            if(done){
                break outer;
            }

            for (int i = start + 1; i < rows; i++) {
                spiral[i][finishColumn] = fill;
                fill++;
            }
            checker:   for (int[] row : spiral) {
                for (int column : row) {
                    if (column != 0) {
                    } else {
                        done = false;
                        break checker;
                    }
                }
            }
            if(done){
                break outer;
            }
            for (int i = finishColumn - 1; i >= start; i--) {
                spiral[finishRow][i] = fill++;
            }
            checker: for (int[] row : spiral) {
                for (int column : row) {
                    if (column != 0) {
                    } else {
                        done = false;
                        break checker;
                    }
                }
            }
            if(done){
                break outer;
            }
            for (int i = finishRow - 1; i > start; i--) {
                spiral[i][start] = fill;
                fill++;
            }

            checker:  for (int[] row : spiral) {
                for (int column : row) {
                    if (column != 0) {
                    } else {
                        done = false;
                        break checker;
                    }
                }
            }
            if(done){
                break outer;
            }
            start++;
            finishColumn--;
            finishRow--;
            columns--;
            rows--;
        }

        return spiral;
    }
}

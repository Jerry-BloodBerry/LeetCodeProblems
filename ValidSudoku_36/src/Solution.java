import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        ArrayList<HashSet<Character>> rows = new ArrayList<>();
        ArrayList<HashSet<Character>> cols = new ArrayList<>();
        ArrayList<HashSet<Character>> boxes = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            cols.add(new HashSet<>());
            boxes.add(new HashSet<>());
        }
        for (int i = 0; i < 9; i++) {
            rows.add(new HashSet<>());
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                if (!rows.get(i).add(board[i][j]) ||
                        !cols.get(j).add(board[i][j]) ||
                        !boxes.get(boxIndex(i, j)).add(board[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    private int boxIndex(int i, int j) {
        if (i < 3 && j < 3) return 0;
        if (i < 3 && j < 6) return 1;
        if (i < 3 && j < 9) return 2;
        if (i < 6 && j < 3) return 3;
        if (i < 6 && j < 6) return 4;
        if (i < 6 && j < 9) return 5;
        if (i < 9 && j < 3) return 6;
        if (i < 9 && j < 6) return 7;
        return 8;
    }
}
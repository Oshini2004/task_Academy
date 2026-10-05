package Recursion;

import java.util.HashSet;

public class SudokuValidator {

    // Function to check whether a Sudoku board is valid
    public static boolean isValidSudoku(char[][] board) {

        // Create 9 HashSets for rows, columns, and blocks (3x3 sub-boxes)
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] blocks = new HashSet[9];

        // Initialize each HashSet (otherwise they are null)
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();   // one set for each row
            cols[i] = new HashSet<>();   // one set for each column
            blocks[i] = new HashSet<>(); // one set for each 3x3 block
        }

        // Traverse each cell of the 9x9 Sudoku board
        for (int i = 0; i < 9; i++) {          // iterate over rows
            for (int j = 0; j < 9; j++) {      // iterate over columns

                char c = board[i][j];          // read the current cell

                if (c == '.') continue;        // skip empty cells ('.' means blank)

                // Find which 3x3 block this cell belongs to
                // Formula: blockIndex = (rowIndex/3)*3 + (colIndex/3)
                // Example: (row=4, col=5) → (4/3)*3 + (5/3) = 1*3 + 1 = 4 → block 4
                int blockIndex = (i / 3) * 3 + (j / 3);

                // Check if digit already exists in the corresponding row, column, or block
                if (rows[i].contains(c)) {
                    return false;  // duplicate found in this row
                }
                if (cols[j].contains(c)) {
                    return false;  // duplicate found in this column
                }
                if (blocks[blockIndex].contains(c)) {
                    return false;  // duplicate found in this 3x3 block
                }

                // If no duplicates, record this digit in the respective sets
                rows[i].add(c);       // mark digit as used in row i
                cols[j].add(c);       // mark digit as used in column j
                blocks[blockIndex].add(c); // mark digit as used in 3x3 block
            }
        }

        // If we scanned all cells without finding duplicates, Sudoku is valid
        return true;
    }

    public static void main(String[] args) {
        // Example Sudoku board input
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        // Call the validator
        if (isValidSudoku(board)) {
            System.out.println("✅ Valid Sudoku");
        } else {
            System.out.println("❌ Invalid Sudoku");
        }
    }
}

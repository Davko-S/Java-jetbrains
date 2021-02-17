package pl.davko.jetbrains.excercise.battleship;

public class GameField {

    public static char[][] generateEmptyField() {
        int rows = 10;
        int columns = 10;
        char[][] field = new char[rows][columns + 1];
        char[] rowId = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

        // Header is printed separately as Strings[] due to number 10
        String[] headers = {" ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (int i = 0; i <= columns; i++) {
            System.out.print(headers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns + 1; j++) {
                if (j == 0) {
                    field[i][j] = rowId[i];
                } else {
                    field[i][j] = '~';
                }
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        return field;
    }
}

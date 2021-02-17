package pl.davko.jetbrains.excercise.battleship;

public class GameField {


    public static char[][] generateEmptyField(int rows, int columns) {
        char[][] field = new char[rows + 1][columns + 1];
        char[] rowId = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        char[] header = {' ', '1', '2', '3', '4', '5', '6', '7', '8', '9', '1'};
        System.arraycopy(header, 0, field[0], 0, header.length);

        for (int i = 0; i < columns + 1; i++) {
            System.out.print(field[0][i] + " ");
        }
        System.out.println("");
        for (int i = 1; i < rows + 1; i++) {
            for (int j = 0; j < columns + 1; j++) {
                if (j == 0) {
                    field[i][j] = rowId[i];
                } else {
                    field[i][j] = '~';
                }
                System.out.print(field[i][j] + " ");
            }
            System.out.println("");
        }
        return field;
    }
}

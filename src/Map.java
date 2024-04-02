public class Map {
    public static final int MAX_X = 20;
    public static final int MAX_Y = 20;

    public static void clearField(char[][] field )
    {
        for (int i = 0; i < MAX_X; i++) {
            for (int j = 0; j < MAX_X; j++) {
                field[i][j] = '_';
            }
        }
    }

    public static void printBoard(char[][] field)
    {
        for (int i = 0; i < MAX_X; i++) {
            for (int j = 0; j < MAX_X; j++) {
                System.out.print(field[i][j]);

            }
            System.out.println();
        }
    }

}

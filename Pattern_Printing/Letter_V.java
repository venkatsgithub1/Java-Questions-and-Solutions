package Pattern_Printing;

public class Letter_V {
    /* @@           @@
     *  @@         @@
     *   @@       @@
     *    @@     @@
     *     @@   @@
     *      @@ @@
     *       @@@
     * */
    public static void main(String[] args) {
        int height = 7;
        int lineThickness = 2;
        int baseThickness = 3;
        String character = "@";
        int proceedingSpaces = 0;
        int trailingSpaces = (height * 2) - 3;

        for (int i = height; i > 1; i--) {
            printSpaces(proceedingSpaces);
            printCharacter(lineThickness, character);
            printSpaces(trailingSpaces);
            printCharacter(lineThickness, character);
            newLine();

            height--;
            proceedingSpaces++;
            trailingSpaces-=2;
        }
        printSpaces(proceedingSpaces);
        printCharacter(baseThickness, character);
    }

    public static void newLine() {
        System.out.println();
    }

    private static void printCharacter(int lineThickness, String character) {
        for (int i = 0; i < lineThickness; i++) {
            System.out.print(character);
        }
    }

    private static void printSpaces(int numberOfSpaces) {
        for (int i = 0; i < numberOfSpaces; i++) {
            System.out.print(' ');
        }
    }
}

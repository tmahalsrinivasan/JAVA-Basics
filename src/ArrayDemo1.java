public class ArrayDemo1 {
    public ArrayDemo1() {
    }

    public static void main(String[] args) {
        int[][] Employee = new int[][]{{11, 12, 13, 14, 16}, {12, 22, 33, 44}, {1, 1, 3}};

        for(int i = 0; i < Employee.length; ++i) {
            for(int j = 0; j < Employee[i].length; ++j) {
                System.out.print(" " + Employee[i][j]);
            }

            System.out.println();
        }

    }
}

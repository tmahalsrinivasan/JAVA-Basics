public class ArrayDem {
    public ArrayDem() {
    }

    public static void main(String[] args) {
        int[][] num = new int[][]{{1, 2, 3}, {1, 2, 3, 4}, {3, 2, 1, 4, 5, 6}, {1, 0}};

        for(int i = 0; i < num.length; ++i) {
            for(int j = 0; j < num[i].length; ++j) {
                System.out.print(" " + num[i][j]);
            }

            System.out.println();
        }

    }
}

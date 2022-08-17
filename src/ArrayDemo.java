public class ArrayDemo {
    public ArrayDemo() {
    }

    public static void main(String[] args) {
        int[][] num = new int[][]{{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 1, 2, 2, 3, 3, 4, 4}, {1}};

        for(int i = 0; i < num.length; ++i) {
            for(int j = 0; j < num[i].length; ++j) {
                System.out.print(" " + num[i][j]);
            }

            System.out.println();
        }

    }
}

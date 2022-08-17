public class EnhancedFor {
    public EnhancedFor() {
    }

    public static void main(String[] args) {
        int[][] d = new int[][]{{1, 2, 3, 4, 5, 6}, {1, 1, 2, 3}, {5, 4, 3, 2, 1}};
        int[][] var2 = d;
        int var3 = d.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int[] k = var2[var4];
            int[] var6 = k;
            int var7 = k.length;

            for(int var8 = 0; var8 < var7; ++var8) {
                int l = var6[var8];
                System.out.print(" " + l);
            }

            System.out.println();
        }

    }
}

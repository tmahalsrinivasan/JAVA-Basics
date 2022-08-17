public class VarArg {
    public VarArg() {
    }

    public static void main(String[] args) {
        VarArg obj = new VarArg();
        System.out.println(obj.add(2, 3, 4, 5));
    }

    public int add(int... n) {
        int total = 0;
        int[] var3 = n;
        int var4 = n.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int var10000 = var3[var5];
            ++total;
        }

        return total;
    }
}

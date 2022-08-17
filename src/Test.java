public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println(obj.addition(1, 3, 5, 7, 9));
    }

    public int addition(int... x) {
        int sum = 0;
        int[] var3 = x;
        int var4 = x.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int i = var3[var5];
            sum += i;
        }

        return sum;
    }
}

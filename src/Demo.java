public class Demo {
    public Demo() {
    }

    public static void main(String[] args) {
        int[] output = num(2, 2, 4, 1);
        System.out.println(output[0]);
        System.out.println(output[1]);
        System.out.println(output[2]);
        System.out.println(output[3]);
        float[] input = values(2.2F, 3.5F, 4.4F, 5.6F, 4.9F);
        System.out.println(input[0]);
        System.out.println(input[1]);
        System.out.println(input[2]);
        System.out.println(input[3]);
        System.out.println(input[4]);
        String op = Details("i am deepak and i live in chicago, illinois and basically from USA");
        System.out.println(op);
    }

    public static int[] num(int i, int i1, int i2, int i3) {
        int[] ele = new int[]{i, i1, i2, i3};
        return ele;
    }

    public static float[] values(float a, float b, float c, float d, float e) {
        float[] array = new float[]{a, b, c, d, e};
        return array;
    }

    public static String Details(String s) {
        s.toUpperCase();
        return s;
    }
}

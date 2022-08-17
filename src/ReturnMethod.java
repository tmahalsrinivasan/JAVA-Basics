public class ReturnMethod {
    public ReturnMethod() {
    }

    public static void main(String[] args) {
        int EID = num();
        System.out.println(EID);
        Name();
        String EMP = Employee("employee works very hard ");
        System.out.println(EMP);
        float sum = per(3.3F, 4.5F);
        System.out.println(sum);
    }

    public static void Name() {
        System.out.println(" tej deepak");
    }

    public static int num() {
        int empID = 2;
        return empID;
    }

    public static String Employee(String s) {
        return s.toUpperCase();
    }

    public static float per(float a, float b) {
        return a * b;
    }
}

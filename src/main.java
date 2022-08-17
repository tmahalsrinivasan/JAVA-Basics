public class main {
    public main() {
    }

    public static void main(String[] args) {
        hospital deepak = new hospital();
        deepak.Patient = "tej";
        deepak.patientID = 123;
        deepak.bill = 45.75F;
        hospital harsha = new hospital();
        harsha.Patient = "mahal";
        harsha.patientID = 134;
        harsha.bill = 23.9F;
        deepak.perform();
        harsha.perform();
    }

}

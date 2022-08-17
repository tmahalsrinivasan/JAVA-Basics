public class hospital {
    static String Doctor = "lessi";
    String Patient;
    int patientID;
    float bill;

    public hospital() {
    }

    public void perform() {
        System.out.println(this.Patient + " :" + this.patientID + " :" + this.bill + ": " + Doctor);
    }
}

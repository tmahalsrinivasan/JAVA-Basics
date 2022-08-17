import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterface {
    public static void main(String[] args) {


        List<Hospital> data = new ArrayList<>();
       data.add(new Hospital(12,01,"Deepak", "Satwik Kamidi"));
        data.add(new Hospital(15,02,"Deepak", "Vishnu Vanki"));
        data.add(new Hospital(30,03,"Deepak", "Charan Kokkanti"));
        data.add(new Hospital(05,04,"Deepak", "Goutam"));

        Collections.sort(data);

        for(Hospital h:data){
            System.out.println(h);
        }
    }


    static class Hospital implements Comparable<Hospital>
    {
        int bill;
        int PatientID;
        String DoctorName;
        String PatientName;

        public Hospital(int bill, int patientID, String doctorName, String patientName) {
            this.bill = bill;
            PatientID = patientID;
            DoctorName = doctorName;
            PatientName = patientName;

        }

        @Override
        public String toString() {
            return "Hospital{" +
                    "bill=" + bill +
                    ", PatientID=" + PatientID +
                    ", DoctorName='" + DoctorName + '\'' +
                    ", PatientName='" + PatientName + '\'' +
                    '}';
        }


        @Override
        public int compareTo(Hospital h) {
            return PatientName.length()>h.PatientName.length()?1:-1;
        }
    }

}

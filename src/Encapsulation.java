

public class Encapsulation {
    public static void main(String[] args) {

        teju obj = new teju();

        obj.setEmpName("deepak");
        obj.setEmpNum(5);
        System.out.println(obj.getEmpName());
        System.out.println(obj.getEmpNum());
    }
    static class teju {

       private int empNum;
        private String empName;

        public int getEmpNum() {
            System.out.println("employee id changed");
            return empNum;


        }

        public void setEmpNum(int empNum) {
            this.empNum = empNum;
            System.out.println("user is accessing to change ID");
        }

        public String getEmpName() {
            System.out.println("employee name is changed");
            return empName;
        }

        public void setEmpName(String empName) {
            this.empName = empName;
            System.out.println("user is accessing to change name");
        }
    }
}

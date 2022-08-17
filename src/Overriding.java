import org.w3c.dom.ls.LSOutput;

public class Overriding {
    public static void main(String[] args) {

        a obj = new a();
        obj.result();

    }
    static class a{
        int i;


        public void result(){

            System.out.println("tej");
        }
    }

   static class b extends a{
        int i;
        public void result(){
           super.i=10;
            //super.result();
            System.out.println("deepak");
        }
    }
}

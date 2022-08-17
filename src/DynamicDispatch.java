//----------------------------Dynamic Method Dispatch------------------------
public class DynamicDispatch {

    public static void main(String[] args) {

        a ref = new b(); ///first we have to create one reference to the parent class and then we have to  assign the ref to the child object
        //then the child class obj will be called as the output.


        ref.result();// also called as run time polymorphism  and also up casting is done here.

    }

   static class a{
         public void result(){
            System.out.println("class a");
        }

    }
     static class b extends  a{
        public void result(){
            System.out.println("class b");
        }
    }
     static  class c extends a{
        public void  result(){
            System.out.println("class c");
        }
     }



}

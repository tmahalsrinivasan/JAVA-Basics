//explaning the abstarct keyword

public  class AbstractDemo {
    public static void main(String[] args) {

hospital obj = new doctors();



    }

    abstract static class hospital {
        public abstract void patients();

    }

   static class doctors extends hospital {


       @Override
       public void patients() {

       }
   }
}




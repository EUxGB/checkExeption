public class Main {

    public static void main(String[] args) {

   Small sm = new Small("Bill");
   try {
       Small bm = (Small) new Big("Bob");
       bm.getName();
   }
   catch (ClassCastException e) {
       System.out.println("Error ClassCastException");
   };
        sm.getName();
    }
}

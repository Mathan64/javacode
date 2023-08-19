class A2 {
    String myname;
    String fname;
    void r1(){
        myname = "mathan";
        fname = "kumar";
    System.out.println(myname);
    }  }
     public class B2 extends A2 //inheritance
     {
    void r2() {
   r1();
   System.out.println(fname);
    }
    public static void main(String args[]){
       B2 p = new B2();
       p.r1();
    }
   }
   
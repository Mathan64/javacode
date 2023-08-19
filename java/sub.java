 class baseclass {
 float salary ;
 void r1(){
 salary =40000;
 System.out.println("my salary is "+salary);
 }  }
  public class sub extends baseclass //inheritance
  {
    int bonus ;
 void r2() {
r1();
bonus=10000;
System.out.println("my bonus is "+bonus);
 }
 public static void main(String args[]){
    sub p = new sub();
    //p.r1;
    p.r2();
 }
}

class F {
    String fatherp1; 
    String fatherp2; 
    String fatherp3;
    void fp(){
        System.out.println("father properties of car");
    } 
    void fp1(){
        System.out.println("father properties of land");
    }       
}
 class S1 extends F 
{
     void s1(){
        
        System.out.println(" son"); 
         S1 p1 = new S1();
         p1.fp();

     }
}
public class ABC extends F{
     void s3(){
        System.out.println("daughter"); 
        ABC p1 = new ABC();
        p1.fp1();
     }
    public static void main(String args[]){
             S1 o1 = new S1();
             o1.s1();
             ABC o2 = new ABC();
             o2.s3();
            
     }

}

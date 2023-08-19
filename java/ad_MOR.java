public class ad_MOR{
    void run(){
        System.out.println("runing");
    }  
}
  class ad_MOR1{
    void run(){
        System.out.println("runing2");
    }
    public static void main(String arg[]){
       ad_MOR o1 = new ad_MOR();
      o1.run();
       ad_MOR1 o2 = new ad_MOR1();
       o2.run();

    }
 } 

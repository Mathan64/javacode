public class logic{
    String name;
    int mark;
    void yes ()
    {
    String name="amal";
    int mark=100;
    System.out.println( "Name ="+name+"\n"+"Mark ="+mark+"\n");
    }
    void no()
    {
    if(mark <=75){
    System.out.println("You're pass");
    }
    else{
    System.out.println("Fail");
    }
    }
    public static void main(String[] args) {
    logic o1=new logic() ;
    o1. yes ();
    logic o2=new logic() ;
    o2. no () ;
    }
    }
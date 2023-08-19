public class add {
    int m1 =70,m2 = 50,m3 =50;
    String  name ="mathan";
    float tot;
    void R()
    {
        System.out.println(name);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);   
    }
    void R1()
    {
        tot =m1+m2+m3;
        if(tot>=150){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }      
    }
    public static void main(String args[]){
        add o1 =new add();
        System.out.println(o1.m1 +o1.m3);
        add o2 =new add();   
            o2.R1();
            
    }
    
}

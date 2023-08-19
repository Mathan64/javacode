public class constructor{
    int m1 =70,m2 = 50,m3 =50;
    String  name ="mathan";
    float tot;
    constructor()
    {
        System.out.println(name);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);   
    }
    void m(){
        System.out.println("mathan");
    }
    public static void main(String args[]){
        constructor o1 =new constructor();
        o1.m();
    }
}
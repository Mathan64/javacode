 //example in multi_level inheritance
 class A1 {
    int a ,b,c,tot;
    float avg;
    String name,grade ;
    void a(){
       a=50;
       b=70;
    c= 87;
    name = "mathan";
    }
}
    class B1 extends A1
    {
        void b() 
        {
      a();
       tot=a+b+b;
       avg=tot/3; 
        }
    } 
    class C1 extends B1
    {
        void c(){
            b();
            if(avg>=80){
                grade = "a";
            }
           else if(avg>=70){
            grade = "b";
            }
           else if(avg>=50){
            grade = "c";  
            }
            else{
                grade = "f";  
            }
        } 
    }
        class D1 extends C1{
            void d(){
                c();
                System.out.println(name);
                System.out.println(tot);
                System.out.println(avg);
                System.out.println("grade "+grade);
            }
        
       public static void main(String args[]){
            D1 o1 = new D1();
            o1.d();
}
        }
    
    
        
          

    
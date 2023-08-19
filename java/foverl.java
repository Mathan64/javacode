public class foverl {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    //type 2
    int add2(int a,int b){
        return a + b ;
    }
    double add2(double a,double b){
        return a/b;
    }
    public static void main(String arg[]){
    foverl o1 = new foverl();
    System.out.println(o1.add(11,11));
    System.out.println(o1.add(1,1,1));
    System.out.println(o1.add2(1,1));
    System.out.println(o1.add2(5.5,2));
}
}

//interface program for college properties
interface mec {
   String c1 = "fc";

interface mit {
   String c1 = "pg";
}
interface miet {
   String c1 = "bus";
}
class C1 implements mit{
    void p1(){
System.out.println("\nmec\t-\t"+c1+"\n");
    }
}
class C2 implements miet{
    void p1(){
System.out.println("mit\t-\t"+c1+"\n");
    }
}
class C3 implements mec{
    void p1(){
System.out.println("miet\t-\t"+c1+"\n");
    }
}
public static void main(String args[]){
    C1 o1 =new C1();
    o1.p1();

    C2 o2 =new C2();
    o2.p1();

    C3 o3 =new C3();
    o3.p1();
}
}




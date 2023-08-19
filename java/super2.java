class base{
    String name = "mathan";
    int m1 = 78;
    int m2 =86;
    int tot =m1+m2;   
}
 class subm extends base{
    float avg = 82;
    String college ="mec";
    void a(){
        System.out.println(college);
        System.out.println(avg);
        System.out.println(super.tot);
 }}
public class super2{
    public static void main(String args[]){
        subm b = new subm();
        b.a();
    }
}
 
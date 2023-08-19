//mark and average using scanner
import java.util.Scanner;
public class scanner12 {
    void sok(){ 
        Scanner in = new Scanner(System.in);
        System.out.println("enter your name");
        String s = in.nextLine();
        System.out.println("enter m1 mark");  
        int  a = in.nextInt(); 
        System.out.println("m1 is "+a);
        System.out.println("enter m2 mark");       
        int b = in.nextInt();
        System.out.println("enter m3 mark");
        int c = in.nextInt();
        System.out.println("name is "+s);
        System.out.println("m2 is "+b);
        System.out.println("m3 is "+c);
        int tot = a + b +c;
        float avg =tot/3;
        System.out.println("avg mark is "+avg);
    }
    public static void main(String args[]){
        scanner12 op = new scanner12();
        op.sok();
    }
}

import java.util.Scanner;
public class Input {
        void basic(){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter Name:");
        String name=in.nextLine();

        System.out.print("Enter num 1:");
        int num1=in.nextInt();

        System.out.print("Enter num 2:");
        int num2=in.nextInt();

        System.out.print("Enter num 2:");
        int num3=in.nextInt();

        int sum=num1+num2+num3;
        int avg=(num1+num2+num3)/3;

        System.out.println("Name:"+name);
        System.out.println("Sum of Marks:"+sum);
        System.out.println("Average:"+avg);

        System.out.println("Enter your College Name:");
        String college= in.nextLine();
        System.out.println("hh"+college);
    }
    public static void main(String[] args) {
        Input obj=new Input();
        obj.basic();
    }
}

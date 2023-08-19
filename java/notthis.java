class student{
    int rollno;
    String name;
    float fee;
    student(int rollno,String name,float fee){
    rollno = rollno;
    name = name ;
    fee = fee ;
    }
    void display(){
System.out.println(rollno+"\t"+name+"\t"+fee);
    }}
public class notthis {
    public static void main(String args[]){
        student s1 = new student(111,"name1",4000);
        student s2 = new student(112,"name2",7000);
        s1.display();
        s2.display();

    }

    
}

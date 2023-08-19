public class student {
    int rollno;
    String name;
    String college ="MEC";
    student(int r,String n){
        rollno = r;
        name = n;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
    public static void main (String args[]){
        student s1 = new student(111,"mathan");
        student s2 = new student(112,"sanjay");
        s1.display();
        s2.display();
    }
    
}

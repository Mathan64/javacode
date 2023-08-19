//biggest of three numbers using && ,|| operator with nested if condition
class HelloWorld {
    public static void main(String[] args) {
        char a1 ='a';
        char b1 ='L';
        int x = a1-b1;
        System.out.println(x);
        char c1 ='A';
        char d ='G';
        int y = c1-d ;
        System.out.println(y);
        char e ='a';
        char f ='G';
        int z =e-f;
        System.out.println(z);
        //Left shift operator
        System.out.println(10<<2);//10*2^2=40
        //right shift operator
        System.out.println(16>>3);//16/2^3=2
        int age = 16;
        String abc="indian";
        if(18<=age && abc=="indian")
        {
            System.out.println("you are eligible to vote");
        }
        else{
            System.out.println("you  are not eligible to vote");
        } 
        int a=5;
        int b=9;
        int c=1;
        if(a<b || a<c){
            if(c<b)
            {
                System.out.println("b is big");
            }
            else{
                System.out.println("c is big");
            }
            if(a>b&&a>c)
            {
                System.out.println("a is big");
            }
            }
        }
    }
    
   /*int num = 5;
   int val =num%2;
   String xyz =(val==0)?"even":"odd";
   System.out.println(xyz)
    }
  biggest of three numbers using if else if ladder
  int a=34;
  int b=77;
  int c=10;
  if(a>b&&a>c){
    System.out.println("a is big");
  }
  else if(b>c){
    System.out.println("b is big");
  }
  else{
    System.out.println("c is big");
  } 
  // chech whether alphabet or not alphabet
  char c = 'A' ;
  int b = c;
  if(b>=65 && b<=90)
    {
        System.out.println("it is alphabet");
    }
    else if(b>=97 && b<=122){
        System.out.println("it is alphabet");
    }
    else{
        System.out.println("it is a not alphabet");
    }
    // chech pass or fail in 3 subject
    System.out.println("hello world");
    int m1 = 76 ;
    int m2 = 5;
    int m3 = 84;
    int total= m1+ m2 + m3 ;
    if(m1>=50 && m2>=50 && m3>=50){
        if(total>=200){
            System.out.println("pass");
        }   
    }else{
        System.out.println("fail");
    }
    int i=1;
    int a=0;
    int b ;
    System.out.println("print even numbers 0-10");
    do{
        a=a+i;
        i++;
        System.out.println(a);
    }
    while(i<=100); 
    int s = 5;
    int i;
    int j;
    for(i=0;i<s;i++){
        for(j=0;j<=i;j++){
            System.out.println("*");
        }
        System.out.println("\n");
    }
    char i = 'r';
    int x;
    int a ;
    if(i=='r'|| i=='R'){
        for(x=1;x<=1000000000;x++){
        a = x*10;
        x = a*10;
        System.out.println(a);}}
        else if(i=='m'|| i=='M'){
            
    }
    else
        for(x=1000000000;x>=1;x--){
        a = x/10;
        x = a/10;
        System.out.println(x);
        }
        int a=1;
        if(a==0);
     System.out.print("sun");
     System.out.println("moon");
  */  



// checked  - unchecked exception
import java.util.*;
import java.io.*;

int a, b , sum = 0;
Scanner sc = new Scanner(System.in);
PrintWriter pw = new PrintWriter("abc.txt");
a = sc.nextInt();
b = sc.nextInt();
sum = a + b ;
System.out.println(10/0);

}

/* Here CE : 
unreported java.io FileNotFound exception 
must be caught  or declared to be thrown
N.B : Complier ignore division by zero exception
*/ 


// Common unchecked Exception

int a=50/0;//ArithmeticException  

String s=null;  
System.out.println(s.length());//NullPointerException  

String s="abc";  
int i=Integer.parseInt(s);//NumberFormatException  

int a[]=new int[5];  
a[10]=50; //ArrayIndexOutOfBoundsException  


// Handling unchecked Exception : with try -catch block
public class JavaExceptionExample{  
  public static void main(String args[]){  
   try{  
       int data=100/0;  
   }catch(ArithmeticException e){
       System.out.println(e);
      }  
   
   //rest code of the program   
   System.out.println("rest of the code...");  
  }  
}  

// output
Exception in thread main java.lang.ArithmeticException:/ by zero
rest of the code...


// Program without Throw
public class StringExample{  
public static void main(String args[]){  
    System.out.println(2/0); 
    
   }
}  

//output :
Error :
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at StringExample.main(StringExample.java:3)
Note :
Here the exception is caused in the main method , so the main method is responsible to create Arithmetic exception object and throw it to JVM . 
So internally  JVM look the the code, no exception handling code. So create a run time error :


// Program with Throw : 
// throwing exception manually to JVM
public class StringExample{  
public static void main(String args[]){  
     throw new ArithmeticException("/ by zero sorry");

   }
}  

// Output:
Error:
Exception in thread "main" java.lang.ArithmeticException: / by zero sorry
	at StringExample.main(StringExample.java:3)


// Use of Throws :
// Checked exception can also be propogated

import java.io.IOException;  
class Testthrows1{  
  void m()throws IOException{  
    throw new IOException("device error");//checked exception  
  }  
  void n()throws IOException{  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   Testthrows1 obj=new Testthrows1();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  

// output
exception handled
normal flow...


// Case 1 : You caught the exception 
//i.e. handle the exception using try/catch.
import java.io.*;  
class M{  
 void method()throws IOException{  
  throw new IOException("device error");  
 }  
}  
public class Testthrows2{  
   public static void main(String args[]){  
    try{  
     M m=new M();  
     m.method();  
    }catch(Exception e){
        System.out.println("exception handled");
      }     
  
    System.out.println("normal flow...");  
  }  
}  

//output
exception handled
       normal flow...


/*
Case2: You declare the exception
A)In case you declare the exception, if exception does not occur, the code will be executed fine.
B)In case you declare the exception if exception occures, an exception will be thrown at runtime because throws does not handle the exception.

A)Program if exception does not occur
*/

import java.io.*;  
class M{  
 void method()throws IOException{  
  System.out.println("device operation performed");  
 }  
}  
class Testthrows3{  
   public static void main(String args[])throws IOException{//declare exception  
     M m=new M();  
     m.method();  
  
    System.out.println("normal flow...");  
  }  
}  

//output
device operation performed
       normal flow...

//B)Program if exception occurs
import java.io.*;  
class M{  
 void method()throws IOException{  
  throw new IOException("device error");  
 }  
}  
class Testthrows4{  
   public static void main(String args[])throws IOException{//declare exception  
     M m=new M();  
     m.method();  
  
    System.out.println("normal flow...");  
  }  
}  

// output : Run Time exception
// Static variable:
/*
a)It makes your program memory efficient 
(i.e., it saves memory).

b)instance variable gets the memory
at the time of object creation, 
each object will have the copy of the instance variable.

Therefore, 
static variable will get the memory only once, 
if any object changes the value of the static variable, 
it will retain its value.

*/
class Student{  

    static int rollno;  
    String name;
    

 Student(String name){  
  this.name = name;
  rollno++;  
  System.out.println(rollno+" "+name);
 }  

}


class TestSuper1 {  
public static void main(String[] args) {  
  Student s1=new Student("Ram");  
  Student s2=new Student("Sita"); 
  Student s3=new Student("SitaRam");    
    }  
}  
-----------------
Output :
1 Ram
2 SitaRam
3 SitaRam

** N.B : if int rollno ; then output is 
1 Ram
1 Sita
1 SitaRam

--------------

// Static variable: is a variable of a class
class Student{  

    static int rollno;  
    String name;
    static String college ="KGEC";
    

 Student(String name){  
  this.name = name;
  rollno++;  
  System.out.println(rollno+" "+name+" "+college);
 }  

}


class TestSuper1 {  
public static void main(String[] args) {  
  Student s1=new Student("Ram");  
  Student s2=new Student("Sita"); 
  Student s3=new Student("SitaRam");    
    }  
}

--------------
// static method 
/* 
static method can access only static member variable
otherwise 
error :non-static variable a cannot be referenced from a static context
*/
class Student{  

    static int rollno;  
    String name;
    static String college ="KGEC";
    static int a = 5;
    

 Student(String name){  
  this.name = name;
  rollno++;  
  System.out.println(rollno+" "+name+" "+college+" "+a);
 }  

static void change(){  
     college = "BBDIT";  
     a = 7;

     }  

}


class TestSuper1 {  
public static void main(String[] args) {  
  Student.change();  // calling static method without object creation
  Student s1=new Student("Ram");  
  Student s2=new Student("Sita"); 
  Student s3=new Student("SitaRam");    
    }  
}

--------------
NB : int a = 5 ; then it will be a error 
---------------------

-- Above program written in another way: using static block
class Student{  

    static int rollno;  
    String name;
    static String college ="KGEC";
    static int a = 5;
    
static {
 college ="BBDIT";
 // System.out.println("static block is invoked");
}
 Student(String name){  
  this.name = name;
  rollno++;  
  System.out.println(rollno+" "+name+" "+college+" "+a);
 }  
}


class IfExample {  
public static void main(String[] args) {  
  Student s1=new Student("Ram");  
  Student s2=new Student("Sita"); 
  Student s3=new Student("SitaRam");    
    }  
}

------------------

/* 
1)Why is the Java main method static?
object is not required to call a static method.
if JVM creates an object first
then call main() method that will lead the problem of extra memory allocation.
*/

/* 2)Java static block
Is used to initialize the static data member.
It is executed before the main method at the time of classloading
*/

class A2{  
  static{System.out.println("static block is invoked");}  
  public static void main(String args[]){  
   System.out.println("Hello main");  
  }  
}  

Output : static block is invoked
Hello main

----------------
Q) Can we execute a program without main() method?
Ans) No, one of the ways was the static block,
but it was possible till JDK 1.6. 
Since JDK 1.7, it is not possible 
to execute a Java class without the main method.

class A3{  
  static{  
  System.out.println("static block is invoked");  
  System.exit(0);  
  }  
}  
------------------

this   KEYWORD 

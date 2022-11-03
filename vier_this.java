Usage of java this keyword
Here is given the 6 usage of java this keyword.

this can be used to refer current class instance variable.
this can be used to invoke current class method (implicitly)
this() can be used to invoke current class constructor.
this can be passed as an argument in the method call.
this can be passed as argument in the constructor call.
this can be used to return the current class instance from the method.

//1) this: to refer current class instance variable
class Student{  
    int rollno;  
    String name;  
    float fee;  


Student(int rollno,String name,float fee){  
   this.rollno=rollno;  
   this.name=name;  
   this.fee=fee;  
}

void display(){
    System.out.println(rollno+" "+name+" "+fee);}  
}  
  
class TestThis2{  
public static void main(String args[]){  
Student s1=new Student(111,"ankit",5000f);  
Student s2=new Student(112,"sumit",6000f);  
s1.display();  
s2.display();  
}}  


// 2) this: to invoke current class method
class A{ 
    void m(){
        System.out.println("hello m");
      }  
    
    void n(){  
    System.out.println("hello n");  
    //m();//same as this.m()  
    this.m();  
  }  
} 

class TestThis4{  
public static void main(String args[]){  
A a=new A();  
a.n();  
}}  


// 3) this() : to invoke current class constructor
Calling default constructor from parameterized constructor:

class A{  

A(){
    System.out.println("hello a");
    }

A(int x){  
    this();  
    System.out.println(x);  
   }  
}  

class TestThis5{  
public static void main(String args[]){  
A a=new A(10);  
  }
}  


// Real usage of constructor
class Student{  

   int rollno;  
   String name,course;  
   float fee;  

Student(int rollno,String name,String course){  
this.rollno=rollno;  
this.name=name;  
this.course=course;  
}  

Student(int rollno,String name,String course,float fee){  
this(rollno,name,course);//reusing constructor  
this.fee=fee;  
}  

void display(){
    System.out.println(rollno+" "+name+" "+course+" "+fee);}  
}  

class TestThis7{  
public static void main(String args[]){  
Student s1=new Student(111,"ankit","java");  
Student s2=new Student(112,"sumit","java",6000f);  
s1.display();  
s2.display();  
}}  


// Note : error if written in this way:
Student(int rollno,String name,String course,float fee){  
this.fee=fee;  
this(rollno,name,course);//C.T.Error  
}  

----------
4) this: to pass as an argument in the method
The this keyword can also be passed as an argument in the method. It is mainly used in the event handling.

class S2{  
  void m(S2 obj){  
  System.out.println("method is invoked");  
  }  
  void p(){  
  m(this);  
  }  
  public static void main(String args[]){  
  S2 s1 = new S2();  
  s1.p();  
  }  
}  
Result:
Application of this that can be passed as an argument:
In event handling (or) in a situation where we have to provide reference of a class to another one. It is used to reuse one object in many methods.
------------

-----------
       ------SUPER---
super is used to refer immediate parent class instance variable and method.
super keyword can also be used to invoke the parent class constructor.

the real use of super keyword. 
Here, Emp class inherits Person class 
so all the properties of Person 
will be inherited to Emp by default. 
To initialize all the property,
we are using parent class constructor from child class. 
In such way, we are reusing the parent class constructor.

class Student {
    int id;
    String name;
    
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    void study(){
        System.out.println("studying...");
    }
}


class Captain extends Student{
    int stipend;
    
    Captain(int id, String name, int stipend){
        super(id,name);
        this.stipend = stipend;
    }
    void getStipend(){
        System.out.println("getting stipend...");
}

void displayInformation(){
    System.out.println(id+" "+name+" "+stipend);
 }
}
class TestSuper5{
    public static void main(String[] args) {
        Captain s1 = new Captain(1,"Ram",1000);
        s1.study();
        s1.getStipend();
        s1.displayInformation();
 

    }
}
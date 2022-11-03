class Student{  

    int rollno;  
    String name;  

 //creating a parameterized constructor  
 //:: we can see it is similar to the method to insertRecord Function
 Student(int r, String n){  
  rollno=r;  
  name=n;  
 }  


 //method to display the values  
 void displayInformation(){
    System.out.println(rollno+" "+name);
  }  
}  


class IfExample {  
public static void main(String[] args) {  
  Student s1=new Student(23,"Aryan");  
  Student s2=new Student(24,"Rohan");  
  s1.displayInformation();
  s2.displayInformation();

    }  
}  

// Overlaoding constructor  
class Student{  

    int rollno;  
    String name;  
    int age ; 

 //creating a parameterized constructor  :: we can see it is similar to the method to insertRecord Function
 Student(int r, String n){  
  rollno=r;  
  name=n;  
 }  

// Overlaoding constructor (number of parameters are increased)
 Student(int r, String n, int a){  
  rollno=r;  
  name=n;  
  age =a;
 }  

 //method to display the values  
 void displayInformation(){
    System.out.println(rollno+" "+name+" "+age);
  }  
}  


class IfExample {  
public static void main(String[] args) {  
  Student s1=new Student(23,"Aryan");  
  Student s2=new Student(24,"Rohan", 45);  
  s1.displayInformation();
  s2.displayInformation();

    }  
}  


// Copy constructor
class Student{  

    int rollno;  
    String name;  

 Student(int r, String n){  
  rollno=r;  
  name=n;  
 }  

 Student(Student s){  
  rollno=s.rollno;  
  name=s.name;  
 }  


 //method to display the values  
 void displayInformation(){
    System.out.println(rollno+" "+name);
  }  
}  


class IfExample {  
public static void main(String[] args) {  
  Student s1=new Student(23,"Aryan");  
  Student s2=new Student(s1);  
  s1.displayInformation();
  s2.displayInformation();

    }  
}  

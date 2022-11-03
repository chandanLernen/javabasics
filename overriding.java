//Java Program to illustrate the use of Java Method Overriding  

//Creating a parent class.  
class Vehicle{  
  //defining a method  
  void run(){System.out.println("Vehicle is running");}  
}

//Creating a child class  
class Bike2 extends Vehicle{  
  //defining the same method as in the parent class  
  void run(){System.out.println("Bike is running safely");}  
  

  public static void main(String args[]){  
  Bike2 obj = new Bike2();//creating object  
  obj.run();//calling method  
  }  
}  

------
// Run Time Polymorphism
class Parent{
 int balance = 10000;
 int gold = 100;
  void marriage(){System.out.println("marry with Sunita ");}

  }

  class Bike2 extends Parent{
  void marriage(){System.out.println("marry with Katrina");}

  public static void main(String args[]){
   Parent obj1 = new Bike2();
   System.out.println(obj1.balance);  
  obj1.marriage();

  }
}  

---- test these and delete the marriage method -----
Parent obj1 = new Parent();
Bike2 obj1 = new Bike2();
Parent obj1 = new Bike2();
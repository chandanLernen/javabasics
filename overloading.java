// 1) Method Overloading: changing no. of arguments
class Adder{  

static int add(int a,int b)
{
    return a+b;
}  

static int add(int a,int b,int c) 
 {
    return a+b+c;
 }

}

class Programmer{  
public static void main(String[] args){  
   System.out.println(Adder.add(11,11));  
   System.out.println(Adder.add(11,11,11));  
 }
}  

// 2) Method Overloading: changing data type of arguments
class Adder{  

static int add(int a,int b)
{
    return a+b;
}  

static double add(double a,double b) 
 {
    return a+b;
 }

}

class Programmer{  
public static void main(String[] args){  
   System.out.println(Adder.add(11,11));  
   System.out.println(Adder.add(11.11,11.11));  
 }
}  

//Q) Why Method Overloading is not possible by changing the return type of method only?
System.out.println(Adder.add(11,11));//ambiguity  
Compile Time Error: method add(int,int) is already defined in class Adder


//Can we overload java main() method?
Yes, by method overloading. 
You can have any number of main methods in a class by method overloading.
But JVM calls main() method which receives string array as arguments only. 
Let's see the simple example:

class TestOverloading4{  
public static void main(String[] args){System.out.println("main with String[]");}  
public static void main(String args){System.out.println("main with String");}  
public static void main(){System.out.println("main without args");}  
}  

// Output: main with String[]


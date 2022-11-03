Example 1: 
//User-defined class objects in Java ArrayList
//Let's see an example where we are storing Student class object in an array list.

class Student{  
  int rollno;  
  String name;  
  int age;  
  Student(int rollno,String name,int age){  
   this.rollno=rollno;  
   this.name=name;  
   this.age=age;  
  }  
}  



import java.util.*;  
 class ArrayList5{  
 public static void main(String args[]){  
  
  //Creating user-defined class objects  
  Student s1=new Student(101,"Sonoo",23);  
  Student s2=new Student(102,"Ravi",21);  
  Student s2=new Student(103,"Hanumat",25);  
  
  //creating arraylist  
  ArrayList<Student> list=new ArrayList<Student>();  
  list.add(s1);//adding Student class object  
  list.add(s2);  
  list.add(s3);  
  
  
  //Getting Iterator  
  Iterator itr=list.iterator();  
  
  //traversing elements of ArrayList object  
  while(itr.hasNext()){  
    Student st=(Student)itr.next();  
    System.out.println(st.rollno+" "+st.name+" "+st.age);  
  }  
 
 }  
}  


// Example 2
import java.util.*;  
class Book {  
int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  
public class ArrayListExample20 {  
public static void main(String[] args) {  
    //Creating list of Books  
    List<Book> list=new ArrayList<Book>();  
    //Creating Books  
    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);  
    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
    //Adding Books to list  
    list.add(b1);  
    list.add(b2);  
    list.add(b3);  
   
    //Traversing list  
    for(Book b:list){  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  

//isEmpty
    System.out.println("Is ArrayList Empty: "+list.isEmpty());    

//Removing specific element from arraylist  
          list.remove("Vijay");  
 //Removing element on the basis of specific position  
          list.remove(0);  

//Adding new elements to arraylist  
          list.addAll(al2); 


//Removing all the elements available in the list  
          al.clear(); 
}  
}  


----
// Example 3
// Serialization and Deserialization

import java.io.*;  
import java.util.*;  
 class ArrayList6 {  
  
        public static void main(String [] args)  
        {  
          ArrayList<String> al=new ArrayList<String>();  
          al.add("Ravi");    
          al.add("Vijay");    
          al.add("Ajay");    
            
          try  
          {  
              //Serialization  
              FileOutputStream fos=new FileOutputStream("file");  
              ObjectOutputStream oos=new ObjectOutputStream(fos);  
              oos.writeObject(al);  
              fos.close();  
              oos.close();  
              //Deserialization  
              FileInputStream fis=new FileInputStream("file");  
              ObjectInputStream ois=new ObjectInputStream(fis);  
            ArrayList  list=(ArrayList)ois.readObject();  
            System.out.println(list);    
          }catch(Exception e)  
          {  
              System.out.println(e);  
          }  
       }  
    }         
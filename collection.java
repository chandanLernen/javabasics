// List Interface
Duplicate Allowed 
Insertion order must be preserved

   //Creating (AL LL VL Stack)
        ArrayList<String> list = new ArrayList<String>();
        LinkedList<String> al=new LinkedList<String>();  
        Vector<String> v=new Vector<String>();  
        Stack<String> stack = new Stack<String>();  

  //Adding object in AL LL VL Stack  
        list.add("ravi");
        list.add("ram");


   // Adding object in stack (LIFO)
        stack.push("Garima");  
    // Removing object in stack (LIFO)
        stack.pop();  

------------
// Print items in AL LL VL Stack

   // a) Traversing list through Iterator  
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    // b) Printing the arraylist object   
      System.out.println(list);  

    // c) Traversing list through for-each loop  
    for(String fruit:list)    
      System.out.println(fruit);    
  
 
----------
//accessing the element    
  System.out.println("Returning element: "+list.get(1));

//changing the element  
  list.set(1,"Dates");  

-------

//Sorting the list  
  Collections.sort(list);  
--------
import java.util.*;  
 
 class Test{  
 
 public static void main(String args[]){  
 
 ArrayList<String> list = new ArrayList<String>();
//  LinkedList<String> al=new LinkedList<String>();  
//  Vector<String> v=new Vector<String>();  
//  Stack<String> stack = new Stack<String>();  
 
      list.add("Mango");//Adding object in arraylist    
      list.add("Apple");    
      list.add("Banana");   
      list.add("Pear");    
      list.add("Grapes");  

      //Printing the arraylist object   
      System.out.println(list);  
 }  
} 

----------
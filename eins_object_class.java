// creating a Student class
class Student {
    
    //field or data member or instance variable  
    int id; 
    String name ;

    // defining method in a class
    void insertRecord(int i, String n){
        id = i;
        name = n;
   }
    // defining another method in a class
   void displayInformation(){
       System.out.println(id+" "+name);
   }

}

// creating a class for main method
class TestSuper1 {
    public static void main(String[] args){
        // creating a Student object with ' new ' keyword
        Student s1 = new Student();
        Student s2 = new Student();
        
        // initializing an object through reference
        s1.id = 1;
        s1.name = "Sita";

        // initializing an object through method
        s2.insertRecord(2,"Ram");
        

        s1.displayInformation();
        s2.displayInformation();


    }
}

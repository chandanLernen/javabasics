// Constructor :
// It is a special type of method which is used to initialize the object.
// Every time an object is created using the new() keyword, at least one constructor is called.


// If we dont create own Constructor
// Java compiler creates a default constructor when object is created
// and initialize the object with null value; 

class Student {
    int id;
    String name;

    void displayInformation(){
        System.out.println(id+" "+name);
    }
}

class TestSuper1{
    public static void main(String[] args){
        Student p1 = new Student();
        p1.displayInformation();
    }
}

// Constructor is called when object is created

class Student {
    int id;
    String name;

    Student(){
        System.out.println("I am constructor and gets called when an object is created");
    }

    void displayInformation(){
        System.out.println(id+" "+name);
    }
}

class TestSuper1{
    public static void main(String[] args){
        Student p1 = new Student();
        p1.displayInformation();
    }
}


// Paramterised constructor
class Student {
    int id;
    String name;

    Student(int i, String n){
        id = i;
        name = n;
    }

    void displayInformation(){
        System.out.println(id+" "+name);
    }
}

class TestSuper1{
    public static void main(String[] args){
        Student p1 = new Student(1, "Jai Shree Hanuman ji");
        p1.displayInformation();
    }
}

// Paramterised constructor : using this
class Student {
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    void displayInformation(){
        System.out.println(id+" "+name);
    }
}

class TestSuper1{
    public static void main(String[] args){
        Student p1 = new Student(1, "Jai Shree Hanuman ji");
        p1.displayInformation();
    }
}


// Constructor overloading
class Student {
    int id;
    String name;

    Student(){
        System.out.println("I am default constructor");
    }

    Student(int i){
        id = i;
    }

    Student(int i, String n){
        id = i;
        name = n;
    }

    void displayInformation(){
        System.out.println(id+" "+name);
    }
}

class TestSuper1{
    public static void main(String[] args){
        Student p1 = new Student();
        Student p2 = new Student(1);
        Student p3 = new Student(2, "Ram");
       p1.displayInformation();
       p2.displayInformation();
       p3.displayInformation();
    }
}

Output :
I am default constructor  // Student p1 = new Student();
0 null  //p1.displayInformation();
1 null  //p2.displayInformation();
2 Ram   //p3.displayInformation();


// Copy Constructor
class Student {
    int id;
    String name;

    Student(int i, String n){
        id = i;
        name = n;
    }

    Student(Student s){
        id = s.id;
        name = s.name;
    }

    void displayInformation(){
        System.out.println(id+" "+name);
    }
}

class TestSuper1{
    public static void main(String[] args){
        Student p1 = new Student(1, "Ram");
        Student p2 = new Student(p1);
        p1.displayInformation();
        p2.displayInformation();
    }
}

//copy constructor; use of 'this' keyword
class Student {
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    Student(Student p){
        id = p.id;
        name = p.name;
    }

    // Student(Student p){
    //     this.id = p.id;
    //     this.name = p.name;
    // }

    void displayInformation(){
        System.out.println(id+" "+name);
    }
}

class TestSuper1{
    public static void main(String[] args){
        Student p1 = new Student(1, "Ram");
        Student p2 = new Student(p1);
        p1.displayInformation();
        p2.displayInformation();
    }
}

Data Hiding : Hiding your internal data. 

class Student {
    int id = 1;
    String name = "Ram";

    void study(){
        System.out.println("studying...");
    }
}


class Captain extends Student{
    int stipend = 1000;
    void getStipend(){
        System.out.println("getting stipend...");}
}

class TestSuper1{
    public static void main(String[] args) {
        Captain s1 = new Captain();
        System.out.println("Captain id is"+s1.id+ "  he gets"+s1.stipend);
        s1.study();
        s1.getStipend();
 

    }
}


----------
Data Hiding : Hiding your internal data. 
If declared private . Data member cant be accessed from out side.
#Error : id has private access in Student
Solution :

class Student {
    private int id;
    private String name;

public void getid(){
      // validation code; you can write here
       this.id = 1;
       this.name = "Ram";
        System.out.println("Captain id is" +id +" "+"his name "+ name);
}
    void study(){
        System.out.println("studying...");
    }
}


class Captain extends Student{
    int stipend = 1000;
    void getStipend(){
        System.out.println("getting stipend...");}
}

class TestSuper1{
    public static void main(String[] args) {
        Captain s1 = new Captain();
        s1.getid();
        System.out.println("Captain gets "+s1.stipend);
        s1.study();
        s1.getStipend();
    }
}

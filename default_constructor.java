class Student {
    int id;
    String name;

Student(){
       System.out.println("I am a boy ");
}

void insertRecord(int i, String n) {
  id = i;
  name = n;
}

void displayInformation(){
  System.out.println(id+" "+name);
 }
}

class IfExample{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.displayInformation();
    }
}
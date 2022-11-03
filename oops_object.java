class Student {
    int id;
    String name;

void insertRecord(int i, String n){
    id = i;
    name = n;

}
void displayInformation(){
    System.out.println(id+" "+name)
 }
}

class IfExample {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.insertRecord(1,"Ram");
        s2.insertRecord(2,"Sita");
        s1.displayInformation();
        s2.displayInformation();

    }
}



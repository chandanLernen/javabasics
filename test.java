class Student {
    int id;
    String name;
    
    void insertRecord(int i, String n){
        id = i;
        name = n;

    }
    
    void displayInformation {
        System.out.println(id+ " "+name);
    }

}


class Test {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();

        s1.id = 1;
        s1.name = 'SitaRam';

        s2.insertRecord(2, "RadheShyam");

        s1.displayInformation();
        s2.displayInformation();

    }
}
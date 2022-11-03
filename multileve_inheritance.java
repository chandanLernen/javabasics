class Student {
    int id = 1;
    String name = "Ram";
    void study(){System.out.println("studying...");}
}

class Captain extends Student{
    int stipend = 1000;
    void getStipend(){System.out.println("getting stipend...");}
}

class Scholar extends Captain{
    void hasTalent(){System.out.println("is talented...");}
}

class Programmer{
    public static void main(String[] args) {
        Scholar s1 = new Scholar();
        System.out.println("Captain id is"+s1.id+ "  he gets"+s1.stipend);
        s1.study();
        s1.getStipend();
        s1.hasTalent();

    }
}
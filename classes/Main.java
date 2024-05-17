package classes;

public class Main {
    public static void main(String[] args)
    {

        Student s1 = new Student(23,"Maanit Goyal", 45.0f);
//        s1.marks = 89.5f;
//        s1.name = "Maanit Goyal";
//        s1.rno = 1;
        Student s2 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.marks);
        System.out.println(s1.rno);
        System.out.println(s2.marks);

    }
}

class Student{
    int rno;
    String name;
    float marks;
    Student(){
        this (13,"Default Person", 78.0f);
    }
    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
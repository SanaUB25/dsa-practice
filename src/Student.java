public class Student {
    public boolean email;
    String name ;
    int age ;
    double gpa ;
    boolean isEnrolled= true;

    Student (String name , int age,double gpa ){
        this.name = name ;
        this.age = age ;
        this.gpa = gpa ;
        this.isEnrolled = true;
    }

    public Student(String sana) {
    }

    void study(){
        System.out.println(this.name +"is Studying");

    }

}

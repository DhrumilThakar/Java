class Student
{
    private String name;
    private int age;
    int marks[] = new int[5];
    Student()
    {
        System.out.println("Constructor is called....");
    }
    Student(String name,int age)
    {
        this.name=name;
        this.age = age;
        System.out.println("Hello "+this.name+" you are "+this.age+" old");
    }
    Student(Student s)//example of shallow copy
    {
        this.name = s.name;
        this.age = s.age;
        this.marks = s.marks;
    }
    //Deep copy ma kai nai khali this.<array name> lakhi devanu **for loop na ander
}
public class constructur 
{
    public static void main(String [] args)
    {
        Student s1 = new Student("Rahul", 20);
        s1.marks[0] = 50;
        s1.marks[1] = 60;
        s1.marks[2] = 70;
        s1.marks[3] = 80;
        s1.marks[4] = 90;
    }
}

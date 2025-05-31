import java.util.*;
class Student {
    Scanner s = new Scanner(System.in);
    public int age;
    public String name;
    public void setAge() 
    {
        System.out.print("Enter your age : ");
        int age = s.nextInt();
        this.age = age;
    }
    public void getName()
    {
        System.out.println(name + "'s is " + age);
    }
    public void setName()
    {
        System.out.print("Enter your name : ");
        String name = s.next();
        this.name = name;
    }
}
public class LearningClass
{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        s1.setName();
        s2.setName();
        s3.setName();
        s4.setName();
        s5.setName();
        s1.setAge();
        s2.setAge();
        s3.setAge();
        s4.setAge();
        s5.setAge();
        s1.getName();
        s2.getName();
        s3.getName();
        s4.getName();
        s5.getName();
    }
}
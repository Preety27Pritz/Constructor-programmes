class Student
{
    String name;
    int rollNum;
    static int count;

    Student(String n)
    {
        name=n;
        rollNum=++count;
    }

    void display()
    {
        System.out.println("Name="+name+" , rollNum="+rollNum);
    }
}
class Test2
{
    public static void main(String args[])
    {
        Student s1=new Student("Raja");
        Student s2=new Student("Rani");
        s1.display();
        s2.display();
    }
}
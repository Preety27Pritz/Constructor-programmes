class A
{
    A()
    {
        System.out.println("Constructor Executed");
    }
}
class Test1
{
    public static void main(String args[])
    {
        new A();
        System.out.println("--------------------");
        new A();
    }
}


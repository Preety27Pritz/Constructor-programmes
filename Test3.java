class C
{
    C()
    {
        System.out.println("No arg constructor");
    }

    C(int i)
    {
        System.out.println("No arg constructor");
    }
}

class Test3
{
    public static void main(String args[])
    {
        new C();
        new C(10);
    }
}
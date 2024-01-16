class Box
{
    int height;
    int width;
    int length;

    Box(int h,int w,int l)
    {
        height=h;
        width=w;
        length=l;
    }

    Box(int n)
    {
        height=n;
        width=n;
        length=n;
    }

    void display()
    {
        System.out.println("Height= "+height+" ,width= "+width+" ,length= "+length);
    }
}

class Test4
{
    public static void main(String args[])
    {
        Box b1=new Box(1,2,3);
        Box b2=new Box(6);
        b1.display();
        b2.display();
    }
}
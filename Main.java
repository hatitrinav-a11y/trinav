class shape2D
{
    int dim1;
    int dim2;
    shape2D(int d)
    {
        dim1=dim2=d;
    }
    shape2D(int d1,int d2)
    {
        dim1=d1;
        dim2=d2;
    }
    shape2D(shape2D ob)
    {
        dim1=ob.dim1;
        dim2=ob.dim2;
    }
    int area()
    {
        return dim1*dim2;
    }
    public void display()
    {
        System.out.println("Dimension 1: " + dim1);
        System.out.println("Dimension 2: " + dim2);
        int a=area();
        System.out.println(a);
        System.out.println();
    }
}
public class Main
{
    public static void main(String args[])
    {
        shape2D obj1=new shape2D(10);
        shape2D obj2=new shape2D(3,7);
        shape2D obj3=new shape2D(obj1);
        obj1.display();
        obj2.display();
        obj3.display();
    }
}

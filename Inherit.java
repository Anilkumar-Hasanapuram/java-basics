class Animal
{
    void cat()
    {
       
        System.out.println("....cat....");
        System.out.println("meow meeeow");
        System.out.println("eating.... food at mid night");
    }
    void dog()
    {
        System.out.println(".....dog....");
        System.out.println("barking.....");
        System.out.println("eating.... ");
        
    }
    void horse()
    {
        System.out.println(".....horse....");
        System.out.println("running.....");
        System.out.println("eating.... ");
        
    }
}
public class Inherit extends Animal
{
    public static void main(String args[])
    {
        Animal ak=new Animal();
        ak.cat();
        ak.dog();
        ak.horse();
        //System.out.println(ak.a);
        
    }
}

package wipro.com.overriding;
class Fruit
{
    String name;
    int size;
    String taste;
    void eat()
    {
        System.out.println("name "+""+" taste");
    }
}
class Orange extends Fruit
{
    void eat()
    {
        System.out.println("Orange "+""+ "Sweet ");
    }
}
class Apple extends Fruit
{
    void eat()
    {
        System.out.println("Apple "+""+ " Sweet");
    }
}
public class Assignment1
{
	public static void main(String[] args) 
	{
	   Fruit a=new Fruit();
	   Orange b=new Orange();
	   Apple e=new Apple();
	   b.eat();
	   e.eat();

	}
}
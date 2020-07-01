package wipro.com.Inheritance;

class Animal
{
    void sleep()
    {
        System.out.println("Animal is sleeping");
    }
    void eat()
    {
        System.out.println("Animal is eating");
    }
}
class Bird extends Animal
{
       void sleep()
    {
        System.out.println("Bird is sleeping");
    }
    void eat()
    {
        System.out.println("Bird is eating");
    } 
    void fly()
    {
        System.out.println("Bird is flying");
    }
}
public class Assignment1
{
	public static void main(String[] args) 
	{
	   Animal a=new Animal();
	   Bird b=new Bird();
	   a.eat();
	   a.sleep();
	   b.eat();
	   b.sleep();
	   b.fly();
	}
}
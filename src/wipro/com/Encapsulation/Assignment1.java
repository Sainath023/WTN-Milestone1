package wipro.com.Encapsulation;

class Author
{
    static String name;
    static String email;
    static char gender;
    Author(String name,String email,char gender)
    {
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
}
class Book
{
    String name1,author;
    double price;
    int qtyInStock;
    Book(String name1)
    {
        this.name1=name1;
    }
        public void setPrice()
    {
        price=100;
    }
    public double getPrice()
    {
        return price;
    }
    public void setQtyInStock()
    {
        qtyInStock=102;
    }
    public int getQtyInStock()
    {
        return qtyInStock;
    }
    public String getName()
    {
        return name1;
    }
   public void getAuthor()
    {
       System.out.println("The name of the author is :"+Author.name);
       System.out.println("The email id is :"+Author.email);
       System.out.println("The gender is :"+Author.gender);
    }
   
}


public class Assignment1
{
public static void main(String[] args)
{
Book b=new Book("Computer Networks");
        Author a=new Author("john","123456@gmail.au",'m');
        b.setPrice();
        b.setQtyInStock();
        System.out.println("The name of the book is :"+b.getName());
        System.out.println("The price of the book is :"+b.getPrice());
        System.out.println("The stock is :"+b.getQtyInStock());
        b.getAuthor();
}
}
package wipro.com.class_and_objects;

public class Assignment1
{
    int width;
    int height;
    int depth;
    Assignment1(int width,int height,int depth)
    {
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    int dispaly()
    {
        return (width*height*depth);
    }
	public static void main(String[] args) 
	{
		Assignment1 m=new Assignment1(3,3,3);
		System.out.println("volume of a box is "+m.dispaly());
	}
}

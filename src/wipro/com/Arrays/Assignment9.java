package wipro.com.Arrays;

public class Assignment9
{
	public static void main(String[] args)
	{
	    int nums[]={1,10,10,2};
		 int i = 0;
    
    while(i < nums.length && nums[i] != 10)
        i++;
              
    for(int j = i + 1; j < nums.length; j++) {
        if(nums[j] != 10) {
            nums[i] = nums[j];
            nums[j] = 10;
            i++;
        }
    }
                                              
    for( ; i < nums.length; i++)
        nums[i] = 0;
    for(i=0;i<nums.length;i++)
    {
        System.out.println(nums[i]);
    }
	}
}

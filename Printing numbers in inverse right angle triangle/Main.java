import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in  = new Scanner(System.in);
        // Get the n value
	    int n = in.nextInt();
	    for(int curr_row = 1; curr_row <= n; curr_row++)
	    {
            // Handle space for each row
          int num=n-(curr_row-1);
	        
            // Handle stars for each row
	        for(int curr_col = 1; curr_col <= n-(curr_row- 1); curr_col++)
	        {
	            System.out.print(num);
              num--;
	        }
	        System.out.println();
	    }
	}
}
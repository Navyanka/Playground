import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,j;
      int count;
      count=n;
      for(i=1;i<=n;i++)
      {
        for (j=1;j<=n;j++)
        {
          if(j==1||j==n||i==1||i==n)
            System.out.print("*");
          else
             System.out.print(" ");
        }
         System.out.print("\n");
      }
            
	}
}
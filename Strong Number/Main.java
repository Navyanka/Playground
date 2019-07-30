import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,fact,temp,rem,sum=0;
      for(temp=n;n>0;n=n/10)
      {
        fact=1;
        rem=n%10;
        for(i=1;i<=rem;i++)
        {
          fact=fact*i;
        }
        sum=sum+fact;
      }
      if(sum==temp)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}
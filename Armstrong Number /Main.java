import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int d,sum=0,temp;
      temp=n;
      while(temp!=0)
      {
        d=temp%10;
        sum=sum+d*d*d;
        temp=temp/10;
      }
      if(sum==n)
        System.out.println("Armstrong Number");
      else
         System.out.println("Not a Armstrong Number");
        
	}
}
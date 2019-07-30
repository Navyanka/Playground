import java.util.Scanner;
public class Main{
	 public static int great(int n1,int n2)
  {
      int min,gcd=0;
     
       if(n1>n2)
       {
         min=n2;
       }
       else
       {
         min=n1;
       }
       while(min>=1)
       {
       if(n1%min==0 && n2%min==0)
       {
         gcd=min;
         break;
       }
       else
       {
         min--;
       }
        
       }
     
    return gcd;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
     int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
     int n=great(n1,n2);
    
     
      
     
       
   System.out.println(great(n,n3));
	}
}
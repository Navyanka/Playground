import java.util.Scanner;
public class Main{
	 public static int great(int n1,int n2,int n3)
  {
      int great;
     
       if(n1>n2)
       {
         great=n1;
       }
       else if(n2>n3)
       {
         great=n2;
       }
       else
       {
         great=n3;
       }
       
        
       
     
    return great;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
     int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt(); 
     
       
   System.out.println(great(n1,n2,n3));
	}
}
import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i;
      int count=1;
      for(i=1;count<=n;i++)
      {
        if(i%2!=0)
        { count++;
        System.out.println(i);
        }
        
      }
     
	}
}
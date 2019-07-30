import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
     // int last=n%10;
      //int first=0;
      int first=n;
      int first1=0;
      while(first>=100)
      {   
          first=first/10;
        
      }
     first=first%10;
      System.out.println(first);
    }
}
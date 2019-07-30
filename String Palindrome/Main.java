import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      int strlen=str.length();
      int end=strlen-1;
      int front=0;
      boolean ismatch=true;
      while(front<end)
      {
        if(str.charAt(front)!=str.charAt(end))
        {
          ismatch=false;
          break;
        }
        front++;
        end--;
      }
      if(ismatch==true)
      {
        System.out.print("Yes");
      }
      else
        System.out.print("No");
      
    } 
}
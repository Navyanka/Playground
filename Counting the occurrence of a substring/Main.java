import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String str1=in.nextLine();
      String str2=in.nextLine();
      int strlen1=str1.length();
       int strlen2=str2.length();
      int cnt=0;
      for(int i=0;i<(strlen1-strlen2+1);i++)
      {
        boolean ismatch=true;
        for(int j=0;j<(strlen2);j++)
        {
          if(str1.charAt(i+j)!=str2.charAt(j))
             
        {
          ismatch=false;
         
        }
        
      }
      if(ismatch==true)
      {
        cnt++;
      }
      }
     
        System.out.print(cnt);
      
    } 
}

        
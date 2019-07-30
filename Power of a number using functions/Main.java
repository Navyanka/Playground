import java.util.Scanner;
class Main{
   public static int power(int base,int exp)
   {
     int res=1;
     while(exp!=0)
     {
       res=res*base;
       exp--;
     }
     return res;
   }
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int base=in.nextInt();
    int exp=in.nextInt();
    int res=power(base,exp);
    System.out.println(res);
  }
}
    
    
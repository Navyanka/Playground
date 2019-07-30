import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx <= n - 1; idx++)
        {
            arr[idx] = sc.nextInt();
        }
        int miss = 0;
        
        /* Compare arr[left] and arr[right] elements
           and when these two elements are not equal. 
           Reset the is_palindrome value as false and stop comparing.
        */
        for(int val=1;val<=n;val++)
        {
          boolean is_found=false;
          for(int indx=0;indx<=n-1;indx++)
          {
            if(arr[indx]==val)
            {
             is_found=true;
            break;
          }
        }
          if(is_found==false)
          {
            miss=val;
            break;
          }
        }
      System.out.print(miss);
    }
}
            
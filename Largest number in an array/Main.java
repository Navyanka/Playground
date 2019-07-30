import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        // Get the array size
        int n = in.nextInt();
        int arr[] = new int[n];
        // Get the array elements
        for(int i = 0; i <= n- 1; i++)
        {
            arr[i] = in.nextInt();
        }
      int high=arr[0];
      for(int i=0;i<=n-1;i++)
      {
        if(high<arr[i])
        {
          high=arr[i];
        }
       
      }
      System.out.println(high);
    }
}
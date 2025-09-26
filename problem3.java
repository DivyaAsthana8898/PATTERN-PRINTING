
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of n:");
      int n = sc.nextInt();
        System.out.println("enter the value of column");//pehle outpput
        int s = sc.nextInt();//fir input
      for(int i = 1;i<=n;i++){
            for(int j=1;j<=s;j++){
               // System.out.print("A "+ "B"+ "C" +"D");
        if (j == 1) System.out.print("A ");
        else if (j == 2) System.out.print("B ");
        else if (j == 3) System.out.print("C ");
        else if (j == 4) System.out.print("D ");

            }
         System.out.println();
        }
        
    }
}
    


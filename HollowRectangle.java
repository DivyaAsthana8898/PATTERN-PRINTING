
import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int n = sc.nextInt();
        System.out.println("Enter the no of columns");
        int m = sc.nextInt();
        for(int i = 0; i<=n ; i++){
            for(int j = 0;j<=m;j++){
                if(i==1 || i==n || j==1 || j == m){
                    System.out.print("*");
                }else{ 
                    System.out.print(" ");
                }
                }System.out.println();

            }//System.out.println();
        }

      

        
    }
    


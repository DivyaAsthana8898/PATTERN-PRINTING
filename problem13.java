import java.util.Scanner;

public class problem13 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of row:");
      int n = sc.nextInt();
        System.out.println("enter the value of column");//pehle outpput
        int s = sc.nextInt();//fir input
      for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
              if((i+j)%2 ==0){
                System.out.print(1 + " ");
              }
              else{
                System.out.print(0 + " ");
              }
            }
         System.out.println();
        }
        
    }
}
    


    

    


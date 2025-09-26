//public class problem5 {
    
import java.util.Scanner;

 public class problem5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of n:");
      int n = sc.nextInt();
        System.out.println("enter the value of column");//pehle outpput
        int s = sc.nextInt();//fir input
      for(int i = 1;i<=n;i++){
            for(int j=1;j<=s;j++){
             //System.out.print((char) (i+64)+"");//ye kh rha ki row m change kro
             System.out.print((char) (j+64)+"");// ye kh rha ki column m change krte jyo i jse 10 diye ho to 10 row m whi print hpjyega 10 row wiyh same conttent
            }
         System.out.println();
        }
        
    }
}
    


    


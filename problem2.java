import java .util.Scanner;
   public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER THE ROW SIZE");
        System.out.println("ENTER THE COLUMN SIZE");
        int row = sc.nextInt();
        int col = sc.nextInt();
        for(int i = 1;i<=row;i++){// providing no of rows
            for(int j = 1;j<=col;j++){
                System.out.print("*");// printing no of columns associated with no of columns J
}

 System.out.println("");//providing new line to print another rows asasociated with i 

    }
    
}
   }

import java.util.Scanner;

public class problem14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER THE ROW SIZE");
        System.out.println("ENTER THE COLUMN SIZE");
        int row = sc.nextInt();
        int col = sc.nextInt();
      //  int a = 1+2;
        for(int i = 1;i<=row;i++){// providing no of rows
            int a = 1;
            for(int j = 1;j<=i;j++){
                System.out.print( a + ""); //FIRSTLY PRINTING THE ONE AND THEN UPDATING
                a+=2;//WITH THIS
            }
            System.out.println();
        }
    }
}

            
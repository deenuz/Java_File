//First pattern question for star printing in squre shape
/* * * * * 
 * * * * * 
 * * * * * 
 * * * * * 
 * * * * */
import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = scan.nextInt();

        Pattern p = new Pattern();
        p.printPattern(n);

        scan.close();
    }


    public void printPattern(int n){
         
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print("* ");
            }

            System.out.println("");
        }
    }    
}

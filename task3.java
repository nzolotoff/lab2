import java.util.Scanner;

public class task3 {
    public static void main (String [] args ) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a positive integer");
        while (true) {
            if (input.hasNextInt()) {
                int num = input.nextInt();
                if (num >0) {
                    int a = 0 ;
                    System.out.println("Your sequence is:");
                    while (num>0) {System.out.print(a); a-=5; num--; }
                }
                else {
                    System.out.println("Integer must be positive");
                    break;}
            }
            else {
                System.out.println("You entered not an integer");
                break ;}
        }


    }
}

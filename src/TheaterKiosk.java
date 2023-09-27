import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userAge = 0;


        System.out.println("Please enter your age, if you're aged 21 or older you will be issued a wristband.");
        userAge = scan.nextInt();

        if (userAge >= 21){
            System.out.println("Congratulations you are old enough to receive a wristband.");
        }
        else if (userAge > 0){
            System.out.println("Sorry you are not old enough to receive a wristband.");
        }
        else {
            System.out.println("Nice try pal. Try again.");
        }
    }
}
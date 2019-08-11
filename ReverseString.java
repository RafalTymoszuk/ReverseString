import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Write a word or a sentence: ");

        String x = sc.nextLine();
        System.out.println("Reversed input: ");
        for (int i = x.length()-1; i >= 0 ; i--) {

            System.out.print(x.charAt(i));

        }
    }
}

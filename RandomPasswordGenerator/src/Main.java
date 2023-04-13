import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    public static String RandomPasswordGenerator(int l){
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwzyx1234567890[!@#$%^&*(),.?:{}|<>]";
        SecureRandom random = new SecureRandom();
        StringBuilder builder = new StringBuilder();

        for (int i=0; i<l; i++){
            int randomIndex = random.nextInt(chars.length());
            builder.append(chars.charAt(randomIndex));
        }
        return builder.toString();
    }

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter the length of your new password in digits:");
        int length = scan.nextInt();

        System.out.println("Your new password is:");
        System.out.println(RandomPasswordGenerator(length));

    }
}
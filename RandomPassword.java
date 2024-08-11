import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomPassword {
    public static void main(String[] args) {
        RandomPassword();
    }

    public static void RandomPassword() {
        List<Character> lowercaseAlphabets = List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        List<Character> uppercaseAlphabets = List.of('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
        List<Character> specialCharacters = List.of('?', '!', '#', '@', '&', '/');
        List<Character> digits = List.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');

        List<Character> totalChars = new ArrayList<>();
        totalChars.addAll(lowercaseAlphabets);
        totalChars.addAll(uppercaseAlphabets);
        totalChars.addAll(specialCharacters);
        totalChars.addAll(digits);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of your password: ");
        int passwordLength = scanner.nextInt();

        if (passwordLength <= 0) {
            System.out.println("Invalid password length.");
            return;
        }

        Random random = new Random();
        StringBuilder randomPassword = new StringBuilder(passwordLength);
        for (int i = 0; i < passwordLength; i++) {
            randomPassword.append(totalChars.get(random.nextInt(totalChars.size())));
        }

        System.out.println("Your password is: " + randomPassword.toString());
    }
}
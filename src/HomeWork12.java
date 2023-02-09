import java.util.Scanner;

public class HomeWork12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a work");
        String subject = scan.nextLine();

        if (!subject.isEmpty()) {
            if (subject.length() > 3 && subject.length() % 2 !=0) {

                char character[] = subject.toCharArray();
                int middle = character.length / 2;
                System.out.println("Middle Character is: " + character[middle]);
            } else {
                System.out.println("invalid");
            }
        }

    }
}

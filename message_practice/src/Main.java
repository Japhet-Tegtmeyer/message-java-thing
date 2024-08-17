import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String content = "";
        Date timestamp = Date.from(Instant.now());
        boolean isSent = false;
        String userName = "";

        Scanner attachedName = new Scanner(System.in);
        System.out.println("Enter name:");

        userName = attachedName.nextLine();

        Scanner message = new Scanner(System.in);
        System.out.println("Enter message:");

        content = message.nextLine();

        Scanner confirmation = new Scanner(System.in);
        System.out.println("Send message? y/n");

        String confirm = confirmation.nextLine();

        switch (confirm) {
            case "y":
                if (content.isEmpty()) {
                    System.out.println("Message has no content, failed to send.");
                    isSent = false;
                } else {
                    System.out.println("Message sent!");
                    isSent = true;
                }
                break;
            case "n":
                isSent = false;
                System.out.println("Message cancelled.");
                break;
        }

        if (isSent) {
            System.out.println(content);
            System.out.println(userName);
            System.out.println(timestamp);
        }
    }
}
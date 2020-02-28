import java.util.Scanner;

public class Application {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. FileAppender");
        System.out.println("2. ConsoleAppender");
        System.out.print("select logger: ");
        String strLogger = scanner.next();
        ILog logger;
        switch (strLogger) {
            case "1":
                logger = new FileAppender(true);
                break;
            case "2":
                logger = new ConsoleAppender();
                break;
            default:
                logger = new ConsoleAppender();
        }

        for (int i = 0; i < 100; i++)
            if (i % 2 == 0)
                logger.writeMessage(String.valueOf(i));
    }
}

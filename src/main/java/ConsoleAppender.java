public class ConsoleAppender implements ILog {

    public void writeMessage(String message) {
        System.out.println(message);
    }
}

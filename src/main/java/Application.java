import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {

    public static void main(String args[]) {
        System.out.println("enter the expression:");
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine().replace(" ", "");
        Pattern p = Pattern.compile("(\\-?\\d+(\\.\\d+)?)(\\D)(\\-?\\d+(\\.\\d+)?)");
        Matcher m = p.matcher(expression);
        m.find();
        double d1 = Double.valueOf(m.group(1));
        double d2 = Double.valueOf(m.group(4));
        String sign = m.group(3);
        switch (sign) {
            case "+":
                new Plus().calc(d1, d2);
                break;
            case "-":
                new Minus().calc(d1, d2);
                break;
            case "*":
                new Multiply().calc(d1, d2);
                break;
            case "/":
                new Divide().calc(d1, d2);
                break;
            default:
                System.out.println("unknown operation");
        }
    }
}

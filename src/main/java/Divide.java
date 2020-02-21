public class Divide implements Calculate {

    public void calc(double d1, double d2) {
        if (d2 == 0) {
            System.out.println("you can't divide by 0");
            return;
        }
        System.out.println(d1 / d2);
    }
}

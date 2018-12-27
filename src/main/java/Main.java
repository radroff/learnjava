import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("123 "+getInt());
    }

    private static int getInt(){
        return new Random().nextInt();
    }
}

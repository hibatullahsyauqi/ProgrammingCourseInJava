import java.util.Random;

public class RollingDice {
    public static void main(String[] args) {

        Random coolNumberBro = new Random();
        int x = coolNumberBro.nextInt(6) + 1;
        System.out.println("You rolled " + x + " dice");

    }
}

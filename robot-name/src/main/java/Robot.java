import java.util.Random;

public class Robot {

    private String name;

    public Robot() {
        reset();
    }

    public String getName() {
        return name;
    }

    public void reset() {
        Random rnd = new Random();
        name = "";
        for (int i=0; i<2; i++) {
            name += Character.toString((char) (rnd.nextInt(26) + 65));
        }
        name += String.valueOf(rnd.nextInt(1000));
    }
}

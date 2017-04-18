package repka;

public class Dog implements RepkaPoll {
    private final int POWER = 4;
    private static volatile Dog instance;

    private Dog() {
    }

    @Override
    public int getPower() {
        return POWER;
    }

    public static Dog getInstance() {
        if (instance == null) {
            synchronized (Dog.class) {
                instance = new Dog();
            }
        }
        return instance;
    }
}

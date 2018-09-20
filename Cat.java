package repka;

public class Cat implements RepkaPoll{
    private final int POWER = 3;
    private static volatile Cat instance;

    private Cat() {
    }

    @Override
    public int getPower() {
        return POWER;
    }

    public static Cat getInstance() {
        if (instance == null) {
            synchronized (Cat.class) {
                instance = new Cat();
            }
        }
        return instance;
    }
}

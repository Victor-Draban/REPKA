package repka;

public class GrandFather implements RepkaPoll {
    private final int POWER = 10;
    private static volatile GrandFather instance;

    private GrandFather() {
    }

    @Override
    public int getPower() {
        return POWER;
    }

    public static GrandFather getInstance() {
        if (instance == null) {
            synchronized (GrandFather.class) {
                instance = new GrandFather();
            }
        }
        return instance;
    }
}

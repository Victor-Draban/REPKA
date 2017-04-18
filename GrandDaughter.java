package repka;

public class GrandDaughter implements RepkaPoll {
    private final int POWER = 8;
    private static volatile GrandDaughter instance;

    private GrandDaughter() {
    }

    @Override
    public int getPower() {
        return POWER;
    }

    public static GrandDaughter getInstance() {
        if (instance == null) {
            synchronized (GrandDaughter.class) {
                instance = new GrandDaughter();
            }
        }
        return instance;
    }
}

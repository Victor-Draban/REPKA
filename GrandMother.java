package repka;

public class GrandMother implements RepkaPoll {
    private final int POWER = 9;
    private static volatile GrandMother instance;

    private GrandMother() {
    }

    @Override
    public int getPower() {
        return POWER;
    }

    public static GrandMother getInstance() {
        if (instance == null) {
            synchronized (GrandMother.class) {
                instance = new GrandMother();
            }
        }
        return instance;
    }
}

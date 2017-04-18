package repka;

public class Mouse implements RepkaPoll {
    private final int POWER = 2;
    private static volatile Mouse instance;

    private Mouse() {
    }

    @Override
    public int getPower() {
        return POWER;
    }

    public static Mouse getInstance() {
        if (instance == null) {
            synchronized (Mouse.class) {
                instance = new Mouse();
            }
        }
        return instance;
    }
}

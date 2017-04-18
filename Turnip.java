package repka;

public class Turnip {
    private final int HEALTH = 36;

    public void canPoll(RepkaPoll... repkaPolls) {
        int sum = 0;
        for (RepkaPoll iter : repkaPolls) {
            sum += iter.getPower();
        }
        if (sum >= HEALTH) {
            System.out.println("Вытащили репку :)");
        } else {
            System.out.println("Репку вытащить не смогли");
        }
    }
}

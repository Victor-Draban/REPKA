package repka;

public class Main {

    public static void main(String[] args) {
        Turnip turnip = new Turnip();
        GrandFather ded = GrandFather.getInstance();
        GrandMother babka = GrandMother.getInstance();
        GrandDaughter vnu4ka = GrandDaughter.getInstance();
        Dog dog = Dog.getInstance();
        Cat cat = Cat.getInstance();
        Mouse mouse = Mouse.getInstance();
        turnip.canPoll(ded, babka, vnu4ka, dog, mouse, cat);
    }

}

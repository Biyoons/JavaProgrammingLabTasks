
public class Blowfish extends Fish implements AnimalBehavior, AnimalMove {
    public Blowfish() {
        super();
    }

    public Blowfish(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void eat() {
        System.out.println("Blowfish Özbilenler is eating.");
    }

    @Override
    public String getVoice() {
        return "No sound (blowfish)";
    }

    public void puff() {
        System.out.println("Blowfish Özbilenler is puffing.");
    }

    @Override
    public void sleep() {
        System.out.println("Blowfish Özbilenler is sleeping.");
    }

    @Override
    public void move() {
        System.out.println("Blowfish swim.");
    }
}


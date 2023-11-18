
public class Dog extends Mammal implements AnimalBehavior, AnimalMove {
    public Dog() {
        super();
    }

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void eat() {
        System.out.println("Dog Özbilenler is eating.");
    }

    @Override
    public String getVoice() {
        return "Woof Woof";
    }

    public void bark() {
        System.out.println("Dog Özbilenler is barking.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog Özbilenler is sleeping.");
    }

    @Override
    public void move() {
        System.out.println("Dog run.");
    }
}

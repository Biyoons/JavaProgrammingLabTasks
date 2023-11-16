
public class Dog extends Mammal {
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
}

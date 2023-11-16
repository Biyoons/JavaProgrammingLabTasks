
public class Pigeon extends Bird {
    private String species;

    public Pigeon() {
        super();
        this.species = "Özbilenler";
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println("Pigeon Özbilenler is eating.");
    }

    @Override
    public String getVoice() {
        return "Coo Coo";
    }

    public void fly() {
        System.out.println("Pigeon Özbilenler is flying.");
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", weight=" + getWeight() +
                ", featherColor='" + getFeatherColor() + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}

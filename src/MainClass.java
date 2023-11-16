
public class MainClass {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Dog("Özbilenler", 3, 10.5);
        animals[1] = new Pigeon("Özbilenler", 2, 0.5, "Gray", "City Pigeon");
        animals[2] = new Blowfish("Özbilenler", 1, 2.0);

        for (Animal animal : animals) {
            System.out.println(animal.toString());
            animal.eat();
            System.out.println("Voice: " + animal.getVoice());

            if (animal instanceof Dog) {
                ((Dog) animal).bark();
            } else if (animal instanceof Pigeon) {
                ((Pigeon) animal).fly();
            } else if (animal instanceof Blowfish) {
                ((Blowfish) animal).puff();
            }

            System.out.println();
        }
    }
}

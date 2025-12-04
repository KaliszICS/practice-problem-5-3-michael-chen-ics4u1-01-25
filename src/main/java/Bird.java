public class Bird extends Animal {
    public Bird(String name, int age, String type, int position) {
        super(name, age, type, position);
    }

    @Override
    public String animalSound() {
        return "Chirp";
    }

    @Override
    void move() {
        setPosition(getPosition() + 50);
    }
}

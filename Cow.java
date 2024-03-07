package OBJP_1;

import OBJP.Animal;

public class Cow extends Animal {
    private String breed;
    public Cow(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Haaamba Haaamba");
    }
}

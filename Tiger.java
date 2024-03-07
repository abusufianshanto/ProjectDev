package OBJP_1;

public class Tiger extends Animal{
    private String breed;
    public Tiger(String name, int age, String breed) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("GSDFSDSGSG");
    }
}

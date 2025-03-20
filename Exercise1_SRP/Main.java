package Exercise1_SRP;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("Aso", "John");
        PetBehavior dogBehavior = new DogBehavior();

        Pet cat = new Pet("Ming", "Jane");
        PetBehavior catBehavior = new CatBehavior();

        System.out.println(dog.getPetName() + " says " + dogBehavior.makeSound());
        System.out.println(dog.getPetName() + " is " + dogBehavior.eat() + "\n");

        System.out.println(cat.getPetName() + " says " + catBehavior.makeSound());
        System.out.println(cat.getPetName() + " is " + catBehavior.eat());
    }
}

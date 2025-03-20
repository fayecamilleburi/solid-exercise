package Exercise1_SRP;

public class DogBehavior implements PetBehavior {
    @Override
    public String makeSound() {
        return "bark!";
    }

    @Override
    public String eat() {
        return "eating dog food.";
    }
}

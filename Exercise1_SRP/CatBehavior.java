package Exercise1_SRP;

public class CatBehavior implements PetBehavior {
    @Override
    public String makeSound() {
        return "meow!";
    }

    @Override
    public String eat() {
        return "eating cat food.";
    }
}

package Exercise2_OCP;

public class Main {
    public static void main(String[] args) {
        Customer student = new Customer("John", new StudentDiscount());
        Customer senior = new Customer("Jane", new SeniorCitizenDiscount());
        Customer regular = new Customer("James", new RegularDiscount());

        System.out.println("Student pays $" + student.applyDiscount(1000));
        System.out.println("Senior citizen pays $" + senior.applyDiscount(1000));
        System.out.println("Regular customer pays $" + regular.applyDiscount(1000));
    }
}

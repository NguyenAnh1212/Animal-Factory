import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Scanner sc = new Scanner(System.in);
        System.out.println("Con pet nhà bạn kêu thế nào? hãy nhập tên pet.");
        String inputName = sc.nextLine();
        Animal a0 = animalFactory.getAnimal(inputName);
        System.out.println(a0.makeSound());

//        Animal a1 = animalFactory.getAnimal("wolf");
//        System.out.println(a1.makeSound());
//
//        Animal a2 = animalFactory.getAnimal("kitten");
//        System.out.println(a2.makeSound());

    }
}

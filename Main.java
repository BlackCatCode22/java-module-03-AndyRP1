// ar 9/12/24
// Main.Java
import mystudent.Student;
import mystudent.App;
import myanimals.Cat;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome from the main!");

       //Create a Student object.
        Student student = new Student();
        // Create an object from a runnable class.
        App app = new App();

        // Use a method from the student class
        // I know that I have a static method on Student class
        // and, i Know how to call a static class method
        Student.sayHello();

        // Call a method that belongs to the student object.
        student.sayHi();

        // Create a cat object.
        Cat cat = new();

        // use a method that is available wto the cat object named cat
        System.out.println("\n This sound is coming from the cat object named cat...");
        cat.animalSound();

        // Create a Dog object
        Dog dog = new Dog();
        //Use a method that is available to the Dog object named dog.
        System.out.println("\n This soud is coming from the Dog object named dog.... ");
        dog.animalSound();







        }
    }

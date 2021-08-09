import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter width");
        double width = scanner.nextDouble();
        System.out.println("Enter height");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.getPerimeter());
    }
}
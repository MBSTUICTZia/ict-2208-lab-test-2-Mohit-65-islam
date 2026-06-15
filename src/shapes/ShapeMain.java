

import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Shape[] shapes = new Shape[n];

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            String color = sc.next();
            boolean filled = sc.nextBoolean();

            if (type.equalsIgnoreCase("RECTANGLE")) {

                double width = sc.nextDouble();
                double length = sc.nextDouble();

                shapes[i] = new Rectangle(
                        color,
                        filled,
                        width,
                        length
                );

            } else if (type.equalsIgnoreCase("CIRCLE")) {

                double radius = sc.nextDouble();

                shapes[i] = new Circle(
                        color,
                        filled,
                        radius
                );
            }
        }

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println();
        }

        System.out.println("--- Downcast Check ---");

        for (Shape shape : shapes) {

            if (shape instanceof Rectangle) {

                Rectangle r = (Rectangle) shape;

                System.out.println(
                        "Rectangle width=" + r.getWidth()
                        + " length=" + r.getLength()
                );

            } else if (shape instanceof Circle) {

                Circle c = (Circle) shape;

                System.out.println(
                        "Circle radius=" + c.getRadius()
                );
            }
        }

        sc.close();
    }
}// Enter code here

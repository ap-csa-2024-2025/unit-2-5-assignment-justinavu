import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Circle c1 = new Circle(10.1);
    Circle c2 = new Circle(14.0);
    Circle c3 = new Circle(20.5);

    System.out.println(c1.toString());
    System.out.println(c2.toString());
    System.out.println(c3.toString());

    Scanner sc = new Scanner(System.in);
    System.out.println("Width/Length: ");
    double lenWid = sc.nextDouble();
    System.out.println("Length:");
    double len = sc.nextDouble();
    System.out.println("Width: ");
    double width = sc.nextDouble();

    Rectangle r1 = new Rectangle(lenWid, lenWid);
    Rectangle r2 = new Rectangle (len, width);
    System.out.println(r1.toString());
    System.out.println(r2.toString());

    System.out.println("Side length (RP): ");
    double side = sc.nextDouble();
    RegularPolygon rp1 = new RegularPolygon(side);
    RegularPolygon rp2 = new RegularPolygon(4, side);
    System.out.println(rp1.toString());
    System.out.println(rp2.toString());
  }
}

import com.workintech.cylinder.*;
import com.workintech.pool.*;
import com.workintech.developers.*;

public class Main {
    public static void main(String[] args) {
        // Circle ve Cylinder test
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        // Rectangle ve Cuboid test
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

        // Developer test
        JuniorDeveloper jd = new JuniorDeveloper(1, "Ali", 1000);
        MidDeveloper md = new MidDeveloper(2, "Ayşe", 2000);
        SeniorDeveloper sd = new SeniorDeveloper(3, "Mehmet", 3000);

        jd.work();
        md.work();
        sd.work();

        JuniorDeveloper[] juniors = new JuniorDeveloper[2];
        MidDeveloper[] mids = new MidDeveloper[2];
        SeniorDeveloper[] seniors = new SeniorDeveloper[2];

        HRManager hr = new HRManager(10, "Kerem", 5000, juniors, mids, seniors);
        hr.work();

        hr.addEmployee(0, jd);
        hr.addEmployee(1, new JuniorDeveloper(4, "Zeynep", 1100));
        hr.addEmployee(0, new JuniorDeveloper(5, "Furkan", 1200)); // dolu index testi

        hr.addEmployee(0, md);
        hr.addEmployee(0, sd);

        System.out.println(hr);
    }
}

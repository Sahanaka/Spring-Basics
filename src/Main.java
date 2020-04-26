/* This project showcases the use of spring framework */

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Main
{
    public static void main(String[] args)
    {
       /* Triangle triangle = new Triangle();
        triangle.draw(); */ // Without the use of bean factory

        // Method 1 : Using the xmlbeanfactory method

        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/spring.xml"));

        // Get the triangle

        Triangle triangle1 = (Triangle) factory.getBean("triangle");

        System.out.println("Using the XmlBeanFactory method");
        triangle1.draw(); // Called the draw method without instantiating an object

        // Method 2 : Using application context

        //ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // Allows closing of the spring file. Should be used in SE applications
        context.registerShutdownHook(); // Destroys all the beans when the main method ends

        Triangle triangle2 = (Triangle) context.getBean("triangle");
        System.out.println("Using the ApplicationContext method");
        triangle2.draw();

        // Also we can preset the value of a member variable without calling the getters and setters
        // The type of the triangles are set to equilateral
        // This is also possible with constructor injection

        // Presetting member variables with constructor injection (i.e all the above instances will also receive the current values)

        Triangle triangle3 = (Triangle) context.getBean("triangle");
        System.out.println("Presetting member variables with constructor injection");
        triangle3.draw();

        // Injecting point object to triangle class

        Triangle triangle4 = (Triangle) context.getBean("trianglewithpoints");
        System.out.println("Injecting Point object");
        triangle4.getCoordinates();

        // It is also possible to get a list of points

        Triangle triangle5 = (Triangle) context.getBean("lists");
        System.out.println("Lists");
        triangle5.printList();

        // Coding to interfaces
        Shapes shape = (Shapes) context.getBean("circle");
        shape.draw();

        System.exit(0);
    }
}

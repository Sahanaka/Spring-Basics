import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

public class Triangle implements Shapes/*implements InitializingBean, DisposableBean*/
{
    private String type; // Type of the triangle
    private int height;  // Height of the triangle

    private Point pointA; // Three points of the triangle
    private Point pointB;
    private Point pointC;

    private List<Point> points; // List of points

    public List<Point> getPoints() { return points; };

    public void setPoints(List<Point> points) { this.points = points; };

    public Triangle() // Default constructor should always exist
    {
    }

    public Triangle(String type, int height)
    {
        this.type = type;
        this.height = height;
    }

    public int getHeight()
    {
        return height;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public Point getPointA()
    {
        return pointA;
    }

    public void setPointA(Point pointA)
    {
        this.pointA = pointA;
    }

    public Point getPointB()
    {
        return pointB;
    }

    public void setPointB(Point pointB)
    {
        this.pointB = pointB;
    }

    public Point getPointC()
    {
        return pointC;
    }

    public void setPointC(Point pointC)
    {
        this.pointC = pointC;
    }

    public void draw()
    {
        System.out.println("Drawing a " + getType()  + " triangle of height " + getHeight() + "\n");
    }

    public void getCoordinates()
    {
        System.out.println("Point A = (" + getPointA().getXcor() + " , " + getPointA().getYcor() + ")");
        System.out.println("Point B = (" + getPointB().getXcor() + " , " + getPointB().getYcor() + ")");
        System.out.println("Point C = (" + getPointC().getXcor() + " , " + getPointC().getYcor() + ")\n");
    }

    public void printList()
    {
        for (Point i : points)
            System.out.println("Point  = (" + i.getXcor() + " , " + i.getYcor() + ")");
    }

    /*@Override
    public void afterPropertiesSet() throws Exception // Runs every time a bean is initialized
    {
        System.out.println("Initializing bean");
    }

    @Override
    public void destroy() throws Exception
    {
        System.out.println("Destroying the bean");
    }*/

    // Same can be achieved by creating custom methods and implementing in the xml file

    public void initBean()
    {
        System.out.println("Initializing the bean");
    }

    public void deleteBean()
    {
        System.out.println("Deleting the bean");
    }
}

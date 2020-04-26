import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shapes
{
    public Point getCenter()
    {
        return center;
    }

    @Autowired  // Would throw compile time error, if not specified run time exceptions might occur . This makes center required
    @Qualifier("center")
    public void setCenter(Point center)
    {
        this.center = center;
    }

    private Point center;

    public void draw()
    {
        System.out.println("Draw a circle");
        System.out.println("Circle of center " + center.getXcor() + " , " + center.getYcor());
    }
}

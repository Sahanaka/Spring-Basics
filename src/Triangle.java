public class Triangle
{
    private String type; // Type of the triangle
    private int height;  // Height of the triangle

    Point pointA; // Three points of the triangle
    Point pointB;
    Point pointC;

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
        System.out.println("Point C = (" + getPointC().getXcor() + " , " + getPointC().getYcor() + ")");
    }
}

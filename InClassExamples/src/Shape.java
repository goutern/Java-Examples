public class Shape {
    private static int count = 0;

    String name;
    int xCoordinate;
    int yCoordinate;

    public Shape() {
        count++;
    }

    public Shape(String name, int xCoordinate, int yCoordinate) {
        this.name = name;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        count++;
    }

    public Shape(Shape s) {
        this.name = s.name;
        this.xCoordinate = s.xCoordinate;
        this.yCoordinate = s.yCoordinate;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
}
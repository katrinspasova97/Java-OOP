package L_01_WorkingWithAbstracts.pointInRectangle;

public class Rectangle {

    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        //нов правоъгълник
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public Point getBottomLeft() {
        return bottomLeft;
    }

    public void setBottomLeft(Point bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    public Point getTopRight() {
        return topRight;
    }

    public void setTopRight(Point topRight) {
        this.topRight = topRight;
    }
    //true -> ако точката е в правоъгълника
    //false -> ако точката не е в правоъгълника
    public boolean contains(Point point){
        //да е вътре по х
        //точката, която е от входните данни, трябва да е по-голям Х-са и от Х-са на точката в ляво
        //и да е по-малък от точката в дясно
        boolean isInsideX = point.getX() >= bottomLeft.getX() && point.getX() <= topRight.getX();
        //да е вътре по у
        //точката, която е от входните данни, трябва да е по-голям У-ка и от У-ка на точката в ляво
        //и да е по-малък от точката в дясно
        boolean isInsideY = point.getY() >= bottomLeft.getY() && point.getY() <= topRight.getY();
        return isInsideX && isInsideY;

        }
    }


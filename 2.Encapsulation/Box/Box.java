package EX_02_Box_01;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setHeight(height);
        setWidth(width);
    }

    private void setLength(double length) {
        if(length > 0){
            this.length = length;
        }else {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }

    }

    private void setWidth(double width) {
        if(width > 0){
            this.width = width;
        }else {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }

    }

    private void setHeight(double height) {
        if(height > 0){
            this.height = height;
        }else {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }

    }
    //Surface Area = 2lw + 2lh + 2wh
    public double calculateSurfaceArea (){
        return 2 * this.length * this.width + 2 * this.width * this.height + 2 * this.height * this.length;
    }
    //Lateral Surface Area = 2lh + 2wh
    public double calculateLateralSurfaceArea (){
        return 2 * this.height * (this.width + this.length);
    }
    //Volume = lwh
    public double calculateVolume (){
        return this.width * this.height * this.length;
    }
}

import exeptions.LengthSideIncorrectException;

public class Circle implements Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    public void validation(){
        if(radius <= 0) throw new LengthSideIncorrectException("Aylana radiusi 0 yoki manfiy bo'la olmaydi");
    }

    public int getRadius(){return radius;}

    @Override
    public double perimeter() {
        validation();
        return (2*Math.PI * getRadius());
    }
}

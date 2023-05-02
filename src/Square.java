import exeptions.LengthSideIncorrectException;

public class Square implements Shape {
    private final int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void validation(){
        if(length <= 0) throw new LengthSideIncorrectException("Kvadrat tomoni 0 yoki manfiy bo'la olmaydi");
    }
    @Override
    public double perimeter() {
        validation();
        return 4*getLength();
    }
}

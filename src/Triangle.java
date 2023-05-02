import exeptions.LengthSideIncorrectException;

public class Triangle implements Shape{
    private final int aLength;
    private final int bLength;
    private final int cLength;

    public Triangle(int aLength, int bLength, int cLength) {
        this.aLength = aLength;
        this.bLength = bLength;
        this.cLength = cLength;
    }

    public int getaLength() {
        return aLength;
    }

    public int getbLength() {
        return bLength;
    }

    public int getcLength() {
        return cLength;
    }
    public void validation(){
        if(aLength <= 0 || bLength <= 0 || cLength <= 0) throw new LengthSideIncorrectException("Uchburchakning tomoni 0 yoki manfiy bo'la olmaydi");
    }

    @Override
    public double perimeter() {
        validation();
        return (aLength+bLength+cLength);
    }
}

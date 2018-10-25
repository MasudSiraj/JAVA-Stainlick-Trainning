public class Square extends Rectangle{


    public Square(int width, int height) {
        if (width!=height)
            throw new IllegalArgumentException();
        else{
            setWidth(width);
            setHeight(height);
        }
    }

    @Override
    public void draw() {
        System.out.println("Drawing myself, the sphere");;
    }


}

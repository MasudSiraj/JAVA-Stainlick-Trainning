public class Rectangle extends Shape{
    private int width, height;

    Rectangle(){}
    Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing myself, the rectangle");;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

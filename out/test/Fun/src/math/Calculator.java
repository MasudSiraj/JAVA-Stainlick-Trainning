package math;

public class Calculator {

    private Adder adder = new Adder();
    private SquareRooter sqrt = new SquareRooter();

    public int add(int x, int y){
        return adder.add(x,y);
    }

    public double sqrt(double x){
        return sqrt.sqrt(x);
    }


}

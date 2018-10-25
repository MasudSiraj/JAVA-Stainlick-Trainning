public class Stopwatch {

    private long startTime;

    public  void start(){
        startTime = System.currentTimeMillis();
    }


    public String stop(){
        return "The elapsed time was " + (System.currentTimeMillis() - startTime) + " milliseconds";
    }
}

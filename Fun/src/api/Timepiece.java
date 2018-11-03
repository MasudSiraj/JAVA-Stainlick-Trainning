package api;

    import java.time.LocalTime;

    @FunctionalInterface
public abstract interface Timepiece {

    public abstract LocalTime whatTimeIsIt();

    default public void talkToTheCrazyThing(){}
}

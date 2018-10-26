package api;

    import java.time.LocalTime;

public abstract interface Timepiece {

    public abstract LocalTime whatTimeIsIt();

    default public void talkToTheCrazyThing(){}
}

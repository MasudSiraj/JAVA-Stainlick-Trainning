import com.sun.media.sound.ModelDestination;

public abstract class Vehicle {


    // bunch or properties
    private double currentTravelSpeed;
    private double assetValue;
    private String destination;



    // bunch of behaviors

    public double getAssetValue(){
        return assetValue;
    }

    public abstract void accelerate();


}

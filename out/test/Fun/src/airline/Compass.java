package airline;

public enum Compass {
    North(0),South(180),East(270),West(90);

    private int azmith;

    Compass(int azmith){
        this.azmith=azmith;
    }

    @Override
    public String toString() {
        return String.format("Headed in azmith %d", azmith);
    }
}

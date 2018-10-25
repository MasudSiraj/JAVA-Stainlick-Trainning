package api;

public abstract class Device {
    private SKU sku;

    public SKU getSku() {
        return sku;
    }

    public void setSku(SKU sku) {
        this.sku = sku;
    }
}

package misc;

public class Car {

    private Double price;
    private double serialNumber;

    public Car(double price){
        this.price=price;
    }

    public void setPrice(){
    }

    public void setPrice(String newPrice){
        System.out.println("You passed a string!");

    }

    private void setPrice(String newPrice,String currency){

    }

    public boolean setPrice(int newPrice){
        System.out.println("You passed an int!");
        return false;
    }



    public Double getCarPrice(){
        return price;
    }

    public double getSerialNumber(){
        return serialNumber;
    }


}

package auto;

public class Train extends Vehicle {

    public int doorsCount(){
        return 200;
    }

    @Override
    public void honk(){
        super.honk();
        System.out.println("HHHHHHHHHOOOOOOOOOOOOOOOONNNNNNNNNNNNKKKKKKKKKKKKKKKKKKKKK");
    }

}

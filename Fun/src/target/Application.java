package target;

public class Application {


    public static void main(String[] args) {
        Store target = new Store();

        ForeignVendor.saveMe(target);

    }

}

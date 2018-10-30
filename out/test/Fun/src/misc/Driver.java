package misc;

public class Driver {


    public static void main(String[] args) {

        if(isX() && isY()){
            System.out.println("They both were true");
        } else{
            System.out.println("They were NOT both true");
        }

    }

    static boolean isX(){
        System.out.println("Evaluating X");
        return false;
    }

    static boolean isY(){
        System.out.println("Evaluating Y");
        return false;
    }
}

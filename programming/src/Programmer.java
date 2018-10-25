public abstract class Programmer {


    private String first, middle, last;

    public Programmer(String first, String middle, String last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    public abstract void program();

    public String getName(){
        return first + " " + middle + " " + last;
    }

}

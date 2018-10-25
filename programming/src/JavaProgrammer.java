public class JavaProgrammer extends Programmer {

    public JavaProgrammer(String first, String middle, String last) {
        super(first, middle, last);
    }

    @Override
    public void program() {
        System.out.println("Using javac to program");
    }
}

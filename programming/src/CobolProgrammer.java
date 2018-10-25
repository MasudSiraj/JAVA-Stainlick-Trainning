public class CobolProgrammer extends Programmer {

    public CobolProgrammer(String first, String middle, String last) {
        super(first, middle, last);
    }

    @Override
    public void program() {
        System.out.println("Using COBOL compiler to program");
    }
}

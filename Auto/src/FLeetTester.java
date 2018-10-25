import java.time.LocalDate;

public class FLeetTester {


    public static void main(String[] args) {


        Train v = new Train();
        v.getAssetValue();
        v.getAssetValue(LocalDate.now().minusMonths(12));



    }
}

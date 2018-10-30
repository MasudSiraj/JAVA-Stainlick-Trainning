public class SqlTiming {




    void runSql(String sqlStatement){

        Stopwatch timer = new Stopwatch();
        timer.start();

        String tellMeHowLong = timer.stop();

        System.out.println(tellMeHowLong);
    }


}

import java.util.ArrayList;
import java.util.Collection;

public class Driver {

    public static void main(String[] args) {
    //  TYPE            object reference variable       a brand new company object
        Company         jpmc =                          new Company();
        Company         caterpillar =                   new Company();

        Programmer      javaGuru =                      new JavaProgrammer("J", "Scott", "Stanlick");
        Programmer      cobolGuru =                     new CobolProgrammer("C", "Santa", "Claus");

        Collection<Programmer> programmingTeam = new ArrayList<>();

        programmingTeam.add(javaGuru);
        programmingTeam.add(cobolGuru);

        jpmc.doProject(programmingTeam);
        jpmc.doProject(javaGuru);

    }

}

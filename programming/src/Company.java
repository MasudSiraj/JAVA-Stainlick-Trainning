import java.util.Collection;

public class Company {


    public boolean doProject(Programmer programmer){
        beginProgramming(programmer);
        return true;
       }

    public boolean doProject(Collection<Programmer> programmers){
        for(Programmer p:programmers)
            beginProgramming(p);
        return true;
    }

    public boolean doProject(Programmer... programmers){
        for(Programmer p:programmers)
            beginProgramming(p);
        return true;
    }

    private void beginProgramming(Programmer programmer) {
        System.out.println(programmer.getName() + " is working on the project");
        programmer.program();
    }


}

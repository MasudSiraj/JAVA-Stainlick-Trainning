package api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User {

    //      TYPE        variable
    private List        list;


    public void needsToKnowTime(Timepiece timepiece){
        System.out.println(timepiece.whatTimeIsIt());
    }
}

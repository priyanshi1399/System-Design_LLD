package ImmutableExample;

import java.util.ArrayList;
import java.util.List;

public final class Immutable {

    private  final String name;
    private final List<String> myList;

    public Immutable(String name,List<String> myList){
        this.name=name;
        this.myList=myList;

    }

    public List<String> getmyList(){
        return new ArrayList<>(myList); //always send a copy of variable in getter
    }


}

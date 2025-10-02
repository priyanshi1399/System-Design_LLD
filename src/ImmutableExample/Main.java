package ImmutableExample;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> newList=new ArrayList<>();
        newList.add("Hello");
        newList.add("Priya");
        Immutable immutable=new Immutable("Priyanshi",newList);
        immutable.getmyList().add("Rose");
        System.out.println(immutable.getmyList());

    }
}

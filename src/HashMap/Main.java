package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String,String> map=new HashMap<>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}

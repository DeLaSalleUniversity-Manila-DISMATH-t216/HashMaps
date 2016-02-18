package ph.edu.dlsu;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");
        System.out.println(map);

        map.put("Alaska", "Juneau");
        System.out.println(map);

        String capital = map.get("Oregon");
        System.out.println("The capitol of Oregon is " + capital);

        map.remove("California");
        System.out.println(map);
    }
}

import java.util.*;

/*
 * 
 * "chennai" -> "bengaluru"
 * "mumbai" -> "delhi"
 * "goa"->"chennai"
 * "delhi"->"goa"
 * 
 * "Mumai" -> "delhi"->"goa"->"chennai"->benagluru
 *  
 *  APPROACH
 * (from , to)
 * 
 * start point will be : from correct to X
 * 
 * from    to
 * ch       b
 * m        d        
 * g        c
 * d       g
 * 
 * <from,to> map
 * <to,from> row map
 * 
 *  
 * 
 * from to
 */
public class FindItineraryfortickets {
    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();

        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);

        }

        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key; // starting point

            }

        }

        return null;

    }

    public static void main(String args[]) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start);

        for (String key : tickets.keySet()) {
            System.out.print("->" + tickets.get(start));
            start = tickets.get(start);
        }

        System.out.println();

    }
}

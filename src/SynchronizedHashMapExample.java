
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedHashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Populate the HashMap
        hashMap.put(3, "Three");
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
       

        // Get a synchronized version of the HashMap
        Map<Integer, String> synchronizedMap = Collections.synchronizedMap(hashMap);

        // Access and modify the synchronized Map
        synchronized (synchronizedMap) {
            for (Map.Entry<Integer, String> entry : synchronizedMap.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}

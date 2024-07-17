import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Sandesh {

  public static void main(String[] args) {
    Map<Integer,String> map = new HashMap<>();
    map.put(1,"One");
    map.put(2,"TWo");
    map.put(3,"Three");

   for (Integer key : map.keySet()) {
    System.out.println("Key is "+key +" value is "+ map.get(key));
   }
  }
}

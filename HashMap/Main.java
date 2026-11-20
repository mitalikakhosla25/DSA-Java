package HashMap;
import java.util.*;
public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, Mitalika Khosla!");
      HashMap<Integer,String> map = new HashMap<>();
      map.put(101,"Divyansh");
      map.put(102,"Riya");
      map.put(104,"Siya");
      map.put(103,"Tiya");
      map.put(10,"Mit");
      System.out.print(map);
    }
}
// hashcode value of key  
// hashmap me bucket traverse hogi on formula : (n -1) &hash


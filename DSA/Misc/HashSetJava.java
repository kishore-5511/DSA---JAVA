// Definition
// A HashMap is a data structure in Java that stores data in key-value pairs.
// Each key is unique, and each key maps to only one value.


package DSA.Misc;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetJava {

   public static void main(String args[]) {
       HashSet<Integer> set = new HashSet<>();
      
       //Add
       set.add(1);
       set.add(2);
       set.add(3);
       set.add(1);

       //Size
       System.out.println("size of set is : " + set.size());

       //Search
       if(set.contains(1)) {
           System.out.println("present");
       }

       if(!set.contains(6)) {
           System.out.println("absent");
       }

       //Delete
       set.remove(1);
       if(!set.contains(1)) {
           System.out.println("absent");
       }

       //Print all elements
       System.out.println(set);

       //Iteration - HashSet does not have an order
       set.add(0);
       Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
           System.out.print(it.next() + ", ");
       }
       System.out.println();

       //isEmpty
       if(!set.isEmpty()) {
           System.out.println("set is not empty");
       }
   }
}





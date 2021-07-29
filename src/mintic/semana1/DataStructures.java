package mintic.semana1;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class DataStructures {

    public static void main(String [] args){
        /* HashSet or conjunct: Do not allows to to have duplicated elements.
         */
        Set<Integer> miHashSet = new HashSet<>();
        miHashSet.add(1);
        miHashSet.add(2);
        miHashSet.add(3);
        miHashSet.add(4);
        miHashSet.add(5);

        System.out.println(miHashSet);

        Map<Integer, String> myMap = new HashMap<Integer, String>();
        myMap.put(1, "David Cardona");
        myMap.put(2, "Jorge Cardona");
        myMap.put(3, "Marisol Orozco");
        myMap.put(4, "Isabel Echeverri");

        System.out.println(myMap);

        if(myMap.containsValue("Isabel Echeverri")){
            System.out.println("Got it");
        }else{
            System.out.println("Try again");
        }


    }

}

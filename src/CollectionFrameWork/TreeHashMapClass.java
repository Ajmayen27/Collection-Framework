package CollectionFrameWork;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;



public class TreeHashMapClass {
    public static void main(String[] args) {

        TreeMap<Integer, Object> mytreeMap = new TreeMap<>();

        mytreeMap.put(1,"Ajmayen");
        mytreeMap.put(2,55);
        mytreeMap.put(-1,45);

         for(Map.Entry<Integer,Object> element:mytreeMap.entrySet()){
             System.out.println(element);
         }

        }
    }


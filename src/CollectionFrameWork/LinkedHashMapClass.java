package CollectionFrameWork;

import javax.swing.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {

    public static void main(String[] args) {

        LinkedHashMap<String,Object> myLinkedHashmap = new LinkedHashMap<>();

        //Time complexity - O(n)
        myLinkedHashmap.put("Name:","Ajmayen Fayek");
        myLinkedHashmap.put("Age:",23);
        myLinkedHashmap.put("Profession:","Student");

        Object age = myLinkedHashmap.get("Age:");
        System.out.println("Age:"+ age);

        boolean isContainKey = myLinkedHashmap.containsKey("Name:");
        System.out.println(isContainKey);

        System.out.println(myLinkedHashmap.isEmpty());

        Object removeKey = myLinkedHashmap.remove("Profession:");
        System.out.println("Removed profession and its value is :"+removeKey);

        LinkedHashMap<String,Object> anotherLHMap = new LinkedHashMap<>();
        anotherLHMap.put("Stack:","Java,Angular");
        anotherLHMap.put("Database:","MySql,Postgres");

        myLinkedHashmap.putAll(anotherLHMap);

        for(Map.Entry<String,Object> element: myLinkedHashmap.entrySet()){
            System.out.println(element.getKey()+" "+element.getValue());
        }
    }
}

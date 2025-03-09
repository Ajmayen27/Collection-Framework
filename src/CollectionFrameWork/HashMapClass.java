package CollectionFrameWork;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

    public static void main(String[] args) {

        HashMap<String,Object> myHashmap = new HashMap<>();

        //Time complexity -O(1)
        myHashmap.put("Name:","Ajmayen Fayek");
        myHashmap.put("Age: ",23);
        myHashmap.put("Address: ","Dhaka");
        myHashmap.put("Occupation: ","Software Engineer");




        Object name = myHashmap.get("Name:");
        System.out.println(name);

        Boolean containKeyData = myHashmap.containsKey("Age:");
        System.out.println(containKeyData);

        int size = myHashmap.size();
        System.out.println(size);

        for(Map.Entry<String,Object> element:myHashmap.entrySet()){
            System.out.println(element.getKey()+" "+element.getValue());
        }

        Object removeValue= myHashmap.remove("Name:");
        System.out.println("The key was removed.Removed values are: "+removeValue);



        HashMap<String,Object > anotherHashmap = new HashMap<>();
        anotherHashmap.put("Tech Stack:","Java,Angular");
        anotherHashmap.put("DataBase:","Mysql,Postgres");

        myHashmap.putAll(anotherHashmap);


        for(Map.Entry<String,Object> element:myHashmap.entrySet()){
            System.out.println(element.getKey()+" "+element.getValue());
        }

        myHashmap.clear();

    }
}

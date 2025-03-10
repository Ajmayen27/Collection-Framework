package CollectionFrameWork;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetClass {

    private static void printHashSet(HashSet<Integer> hashSet){
        System.out.println("printing my HashSet: ");

        for(Integer element:hashSet){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {

//        HashSet<Integer> myHashSet = new HashSet<>();
//
//        myHashSet.add(1);
//        myHashSet.add(2);
//        myHashSet.add(3);
//        myHashSet.add(2);
//        myHashSet.add(5);

        ArrayList<Integer> myArray = new ArrayList<>();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(3);
        myArray.add(4);


        HashSet<Integer> myHashSet = new HashSet<>(myArray);
        System.out.println("Size: "+myHashSet.size());
        System.out.println("Is the number Contain:"+myHashSet.contains(1));


        printHashSet(myHashSet);

    }
}

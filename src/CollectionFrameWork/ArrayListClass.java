package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {

    public static void main(String[] args) {

        ArrayList<Integer> myArray = new ArrayList<>();

        myArray.add(1);
        myArray.add(2);
        myArray.add(10);
        myArray.add(22);
        myArray.add(35);

        System.out.println("Before adding element");
        for(int num : myArray){
            System.out.println(num);
        }
        System.out.println("Array Size :"+myArray.size());

        myArray.add(2,3);
        myArray.add(4,23);

        System.out.println("After adding element");
        for(int Addnum : myArray){
            System.out.println(Addnum);
        }
        System.out.println("Array Size :"+myArray.size());

        myArray.remove(2);
        myArray.remove(3);
        myArray.remove(4);
        System.out.println("After removing element");
        for(int newnum: myArray){
            System.out.println(newnum);
        }
        System.out.println("Array Size :"+myArray.size());

        Collections.sort(myArray);
        System.out.println(myArray);

        myArray.set(0,8);
        System.out.println(myArray);

    }
}

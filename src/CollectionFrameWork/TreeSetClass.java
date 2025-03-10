package CollectionFrameWork;

import java.util.TreeSet;

public class TreeSetClass {

    public static void main(String[] args) {

        TreeSet<Integer> myTreeset = new TreeSet<>();

        myTreeset.add(1);
        myTreeset.add(2);
        myTreeset.add(3);
        myTreeset.add(1);
        myTreeset.add(5);

        printTreeSet(myTreeset);
    }

    private static  void printTreeSet(TreeSet<Integer> treeSet){
        System.out.println("printing tree set: ");
        for(Integer element:treeSet){
            System.out.println(element);
        }
    }
}

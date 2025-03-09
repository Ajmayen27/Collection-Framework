package CollectionFrameWork;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {

        LinkedList<Integer> myLinkedList = new LinkedList<>();

        myLinkedList.add(5);
        myLinkedList.add(4);
        myLinkedList.add(3);
        myLinkedList.add(2);
        myLinkedList.add(1);

        for(int lList: myLinkedList){
            System.out.println(lList);
        }

        myLinkedList.add(7);
        myLinkedList.add(0,0);
        myLinkedList.remove(5);

        System.out.println("After adding and removing: ");
        for(int lList: myLinkedList){
            System.out.println(lList);
        }

        myLinkedList.addFirst(9);
        myLinkedList.addLast(0);

        System.out.println("After adding first and last :");
        for(int lList: myLinkedList){
            System.out.println(lList);
        }

    }
}

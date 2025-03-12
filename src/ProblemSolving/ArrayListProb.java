package ProblemSolving;


import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class ArrayListProb {
    public static void main(String[] args) {



        ArrayList<Integer> myArrayList = new ArrayList<>();

        myArrayList.add(1);
        myArrayList.add(22);
        myArrayList.add(2);
        myArrayList.add(33);
        myArrayList.add(22);
        myArrayList.add(23);

        ArrayList<Integer> myArrayList2 = new ArrayList<>();

        myArrayList2.add(101);
        myArrayList2.add(202);
        myArrayList2.add(303);

        System.out.println("The ArrayList is: ");
        for(int withDElement:myArrayList){
            System.out.println(withDElement);
        }

        printArrayListWithoutDuplicateValue(myArrayList);
        printSecondLargestValue(myArrayList);
        margeTwoArrayList(myArrayList,myArrayList2);
        reverseArrayList(myArrayList);


    }


    //Remove Duplicates from ArrayList
    //Write a program to remove duplicate elements from an ArrayList.
    private static void printArrayListWithoutDuplicateValue(ArrayList<Integer> arrayList){

        System.out.println("Without duplicate Value: ");

        ArrayList<Integer> newAList = new ArrayList<>();
        for(int element: arrayList){
            if(!newAList.contains(element)){
               newAList.add(element);
            }
        }


        for(int newElement:newAList){
            System.out.println( newElement);

        }
    }


    // Find the Second Largest Element in an ArrayList
    //Given an ArrayList of integers, find the second largest element.
    private static void printSecondLargestValue(ArrayList<Integer> arrayList){

        ArrayList<Integer> newAList = new ArrayList<>();

         Collections.sort(arrayList);
         for (int element: arrayList){
             newAList.add(element);
         }

         System.out.println("Second Last element: "+newAList.get(newAList.size()-2));
    }


    //    Merge Two ArrayLists
    // Write a program to merge two ArrayLists into a single ArrayList.
    private static  void margeTwoArrayList(ArrayList<Integer> list1,ArrayList<Integer> list2){
        list1.addAll(list2);

        System.out.println("Marge: ");
        for(int elements:list1){
            System.out.println(elements);
        }
    }



    private static void reverseArrayList(ArrayList<Integer> arrayList){
        System.out.println("Reverse oreder: ");
        for(int i = arrayList.size()-1;i >= 0;i--){
            System.out.println(arrayList.get(i));
        }
      }

    }

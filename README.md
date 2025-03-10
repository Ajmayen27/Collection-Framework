ArrayList:
Array List is A class that implements List interface.The ArrayList class has a regular array inside it.When an element is added,it is placed into the array.If the array is not big enough,a new regular array is created to replace the old one is removed.

*Implements List interface
*Maintains insertion order
*Internal data structure is a regular array.
*Dynamic Size
*Allows duplicates and any number if null values
*Can not use premitive data type(int,float,double,string)
*Best to Storing and accessing data

Time Complexity:
add() – takes O(1) time; however, worst-case scenario, when a new array has to be created and all the elements copied to it, it’s O(n)
add(index, element) – on average runs in O(n) time
get() – is always a constant time O(1) operation
remove() – runs in linear O(n) time. We have to iterate the entire array to find the element qualifying for removal.
indexOf() – also runs in linear time. It iterates through the internal array and checks each element one by one, so the time complexity for this operation always requires O(n) time.
contains() – implementation is based on indexOf(), so it’ll also run in O(n) time.



LinkedList:
Linked list is a class that implements List and deque interface.The functionalit y and behaviour of the Linked list class is similar to ArrayList.
main differences is their internal implemantation.ArrayList uses regular Array and Linked List uses actual Linked list as the internal implementation.

*Implement List and Deque interface
*Maintains insertion order
*Dynamic size
*Allows duplicates and any number of null values.
*Cannot use premetive data types.
*Best for manpulating data.

Time Complexity: Traversal of a singly-linked list takes O(n) time, where 'n' is the number of nodes in the list. This is because you must visit each node one by one.
Space Complexity: Traversal requires O(1) space, as you only need a few extra variables to keep track of your position.


HashMap:
Hashmap is class that implements Map interface. The functionality and behaviour is similar to map.Thats meana it doesnt allows anyb duplicate keys.And only one null key is
accepted.

*Implements map interface.
*Doesn't maintain insertion order
*Dynamic size
*Allows no duplicate key,only one null key.
*Can not use primitive data type(int,float,double,string)
*Best for quickly retriving values based on particular key.

Time Complexity:
Average Case:
Insertion (average): O(1)
Lookup (average): O(1)
Deletion (average): O(1)
Worst Case:

Insertion (worst): O(n), where n is the size of the hash map. This occurs when there are many hash collisions, 
leading to linear probing or other collision resolution strategies that may involve traversing the entire hash map.
Lookup and Deletion (worst): O(n), for the same reason as insertion.


LinkedHashmap:
LinkedHashMap is a class that implements the Map interface and extends the HashMap class. The LinkedHashMap class maintains a linked list of the entries in the map, in the order in which they were inserted. This allows for predictable iteration order, unlike HashMap, which does not guarantee any specific order. When an element is added, it is placed into the internal data structure while maintaining the insertion order. If a key is re-inserted, the insertion order is not affected.

*Implements Map interface
*Extends HashMap class
*Maintains insertion order (or access order if configured)Internal data structure is a combination of a hash table and a doubly-linked list
*Dynamic SizeAllows one null key and any number of null values
*Does not allow duplicate keys, but allows duplicate values
*Cannot use primitive data types (e.g., int, float, double); must use their wrapper classes (e.g., Integer, Float, Double)
*Best for maintaining insertion order while providing fast access, insertion, and deletion


Time Complexity:
put() – Takes O(1) time on average; however, in the worst-case scenario (e.g., when resizing the internal hash table), it can take O(n) time.

get() – Takes O(1) time on average; in the worst case (e.g., due to hash collisions), it can take O(n) time.

remove() – Takes O(1) time on average; in the worst case, it can take O(n) time.

containsKey() – Takes O(1) time on average; in the worst case, it can take O(n) time.

Iteration – Takes O(n) time, where n is the number of elements in the map, because it follows the linked list structure to maintain order.


TreeMap:
TreeMap is a class that implements the NavigableMap interface and extends the AbstractMap class. The TreeMap class stores its elements in a red-black tree structure, which is a type of self-balancing binary search tree. This ensures that the elements are always sorted in a natural order (or according to a specified comparator). When an element is added, it is placed into the tree in its correct sorted position. If a key is re-inserted, its value is updated, but the sorting order remains intact.

Implements NavigableMap interface

Extends AbstractMap class

Maintains elements in sorted order (natural order or custom order defined by a comparator)

Internal data structure is a red-black tree

Dynamic Size

Does not allow null keys (if natural ordering or comparator is used) but allows multiple null values

Does not allow duplicate keys, but allows duplicate values

Cannot use primitive data types (e.g., int, float, double); must use their wrapper classes (e.g., Integer, Float, Double)

Best for maintaining sorted order while providing efficient retrieval, insertion, and deletion

Time Complexity:
put() – Takes O(log n) time because it needs to maintain the balanced tree structure.

get() – Takes O(log n) time as it searches the tree.

remove() – Takes O(log n) time because it needs to rebalance the tree after removal.

containsKey() – Takes O(log n) time as it searches the tree.

Iteration – Takes O(n) time, where n is the number of elements in the map, because it traverses the tree in sorted order.



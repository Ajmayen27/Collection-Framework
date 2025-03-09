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

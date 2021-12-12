# AL_ABA
## Team ABA - Ariella Katz, Alif Rahman, Brianna Tieu, Tom, Grippy, Pepe
* ALTester:
  * Attributes: none
  * orderCheck(ArrayList<Integer> aList): Traverses aList. If it finds an element that is greater than the proceeding 
  element, it returns false. If it gets through the entire ArrayList without finding such a case, it returns true.
  * populate(ArrayList<Integer> aList): Populates aList with random ints on the interval [0,100) by traversing it and 
  using the provided set(index) method for each element.
* OrderedArrayList:
  * Attributes: ArrayList<Integer> aList
  * get(int index): Returns the element at the inputted index by calling the get(int index) method provided by class 
  ArrayList.
  * set(int index, int newVal): Sets the value of the element at the inputted index as newVal and returns the previous 
  value of that element. Declares local variable int oldVal and initializes it as the value returned by the 
  set(int index, java.lang.Object o) method provided by class ArrayList (thereby calling this method for index and 
  newVal). Calls order() (see below) and returns oldVal.
  * add(int newVal): Returns true, as required. Declares local variable boolean bool and initializes it as the value 
  (true) returned by the add(java.lang.Object o) method provided by class ArrayList (thereby calling this method for 
  newVal). Calls order() (see below) and returns bool.
  * remove(int index): Works the same as set(int index, int newVal) except with the remove(int index) method 
  provided by class ArrayList.
  * size(): Returns the value returned by the size() method provided by class ArrayList.
  * order(): Creates a new ArrayList<Integer>, bList, and sets it equal to aList. (bList is now an alias for aList.) 
  Traverses bList, setting each element equal to the minimum value of aList using the set(int index, java.lang.Object o) 
  method provided by class ArrayList. (With each iteration, the minimum of aList is found and later removed, using the 
  remove(int index) method provided by class ArrayList, so that the next iteration will use the next-smallest element). 
  After bList has been populated by aList's elements in ascending order, aList is set equal to bList (aList is now an 
  alias for bList; aList is an alias for the ascending-order version of itself). Does not return anything.

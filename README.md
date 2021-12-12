# AL_ABA
## Team ABA - Ariella Katz, Alif Rahman, Brianna Tieu, Tom, Grippy, Pepe
* ALTester:
  * Attributes: none
  * `orderCheck(OrderedArrayList oAList)`: Traverses oAList. If it finds an element that is greater than the proceeding 
  element, it returns false. If it gets through the entire OrderedArrayList without finding such a case, it returns true.
  * `populate(OrderedArrayList oAList)`: Populates oAList with random ints between 0-100 by traversing it and using the 
  provided `set(int index)` method for each element.
* OrderedArrayList:
  * Attributes: `ArrayList<Integer> aList`
  * `get(int index)`: Returns the element at `index` by calling the `get(int index)` method provided by class ArrayList.
  * `set(int index, int newVal)`: Sets the value of the element at `index` as `newVal` and returns the previous value of
  that element. Declares local variable `int oldVal` and initializes it as the current value. Calls the `set(int index, 
  java.lang.Object o)` method provided by class ArrayList for `index` and `newVal`. Calls `order()` (see below) and 
  returns `oldVal`.
  * `add(int newVal)`: Returns `true`, as required. Calls the `add(java.lang.Object o`) method provided by class 
  ArrayList for `newVal`. Calls `order()` (see below) and returns `true`.
  * `remove(int index)`: Works the same as `set(int index, int newVal)` except with the `remove(int index)` method 
  provided by class ArrayList.
  * `size()`: Returns the value returned by the `size()` method provided by class ArrayList.
  * `order()`: Creates a new `ArrayList<Integer>`, `bList`. Adds the minimum value of `aList` to `bList`, using the `add(java.lang.Object o)` method provided by class ArrayList (with each iteration, the minimum of `aList` 
  is found and later removed, using the `remove(int index)` method provided by class ArrayList, so that the next 
  iteration will use the next-smallest element), and iterates for the number of elements in the original `aList`. After 
  `bList` has been populated by `aList`'s elements in ascending order, `aList` is set equal to `bList` (aList is now an 
  alias for `bList`; `aList` is an alias for the ascending-order version of itself). Does not return anything.

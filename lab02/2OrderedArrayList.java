// ABA - Ariella Katz, Alif Rahman, Brianna Tieu, Tom, Grippy, Pepe
// APCS
// Lab02 -- Well Al B. Sorted
// 2021-12-13


/**********************************************
 * class OrderedArrayList
 * wrapper class for ArrayList
 * maintains invariant that elements are ordered (ascending)
 * (SKELETON)
 **********************************************/


import java.util.ArrayList;

public class OrderedArrayList
{

  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;

  // default constructor
  // initializes instance variables
  public OrderedArrayList()
  {
	_data = new ArrayList<Integer>();
  }

  public String toString()
  {
	return _data.toString();
  }

  public Integer remove( int i )
  {
	int oldVal = get(i);
	_data.remove(i);
	return oldVal;
  }

  public int size()
  {
	return _data.size();
  }

  public Integer get( int i )
  {
	return _data.get(i);
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {
	for (int i = 0; i < size(); i++) {
		if (newVal < _data.get(i)) {
			_data.add(i, newVal);
			return;
		}
	}
	_data.add(newVal);
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public void addBinary(Integer newVal)
  {
	int start = 0;
  int middle = (size()-1)/2;
  int end = size()-1;
  while (start != middle) {
    if (newval >= _data.get(middle)) {
      start = middle;
      middle += (middle - start) / 2;
    }
  }
  }

  // main method solely for testing purposes
  public static void main( String[] args )
  {
    /*-----v-------move-me-down-----------------v--------
    OrderedArrayList Franz = new OrderedArrayList();
    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ )
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
      =====^====================================^=========*/

  }//end main()

}//end class OrderedArrayList

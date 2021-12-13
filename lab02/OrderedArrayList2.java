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

public class OrderedArrayList2
{

  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;

  // default constructor
  // initializes instance variables
  public OrderedArrayList2()
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
	if (size() > 0) {
		for (int i = 0; i < size(); i++) {
			if (newVal < _data.get(i)) {
				_data.add(i, newVal);
				return;
			}
		}
	}
	_data.add(newVal);
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public void addBinary(Integer newVal)
  {
	if (size() > 0) {
	        int start = 0;
        	int middle = (size()-1)/2;
	        int end = size()-1;
        	while (end - start > 1) {
              		if (newVal >= _data.get(middle)) {
                    		start = middle;
                    		middle += (end - middle) / 2;
              		}
              		else {
                    		end = middle;
                    		middle = start + (middle - start) / 2;
              		}
        	}
		if (newVal >= _data.get(end)) { _data.add(newVal); }
		else if (newVal >= _data.get(start)) { _data.add(end, newVal); }
		else { _data.add(start, newVal); }
	}
	else { _data.add(newVal); }
  }

  // main method solely for testing purposes
  public static void main( String[] args )
  {
    OrderedArrayList2 Franz = new OrderedArrayList2();
    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
    // testing binary search
    Franz = new OrderedArrayList2();
    for( int i = 0; i < 15; i++ )
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
/* 
     =====^====================================^=========*/

  }//end main()

}//end class OrderedArrayList

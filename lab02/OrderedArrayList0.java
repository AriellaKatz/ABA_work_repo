import java.util.ArrayList;

public class OrderedArrayList{

	private ArrayList<Integer> aList;

	public OrderedArrayList0() {
		aList = new ArrayList<Integer>();
	}

	public String toString() {
		return aList.toString();
	}

	public int get(int index) {
		return aList.get(index);
	}

	public int set(int index, int newVal) {
		int oldVal = get(index);
		aList.set(index, newVal);
		order();
		return oldVal;
	}

	public boolean add(int newVal) {
		aList.add(newVal);
		order();
		return true;
	}

	public int remove(int index) {
		int oldVal = get(index);
		aList.remove(index);
		order();
		return oldVal;
	}

	public int size() {
		return aList.size();
	}

	public void order() {
		ArrayList<Integer> bList = new ArrayList<Integer>();
		int size = aList.size();
		for (int i = 0; i < size; i++) {
			//Find the minimum of aList:
			int aMin = aList.get(0);
			int aMinInd = 0;
			for (int n = 0; n < aList.size(); n++) {
				if (aMin >= aList.get(n)) {
					aMin = aList.get(n);
					aMinInd = n;
				}
			}
			//Set bList[i] = the minimum of aList:
			bList.add(aMin);
			//Remove aList's minimum so that for the next
			//iteration, it'll find the next-smallest element:
			aList.remove(aMinInd);
		}
		//Set aList = to its ordered vesion, bList:
		aList = bList;
	}

}

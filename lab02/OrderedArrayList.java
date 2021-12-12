import java.util.*;

public class OrderedArrayList{

	private ArrayList<Integer> aList;

	public int get(int index) {
		return aList.get(index);
	}

	public int set(int index, int newVal) {
		int oldVal = aList.set(index, newVal);
		order();
		return oldVal;
	}

	public boolean add(int newVal) {
		boolean bool = aList.add(newVal);
		order();
		return bool;
	}

	public int remove(int index) {
		int oldVal = aList.remove(index);
		order();
		return oldVal;
	}

	public int size() {
		return aList.size();
	}

	public void order() {
		ArrayList<Integer> bList = new ArrayList<Integer>();
		bList = aList;
		for (int i = 0; i < bList.size(); i++) {
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
			bList.set(i, aMin);
			//Remove aList's minimum so that for the next
			//iteration, it'll find the next-smallest element:
			aList.remove(aMinInd);
		}
		//Set aList = to its ordered vesion, bList:
		aList = bList;
	}

}

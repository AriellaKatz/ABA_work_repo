import ap.java.util;

public class OrderedArrayList{

	public static void order(ArrayList<Integer> aList) {
		ArrayList bList = new ArrayList();
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

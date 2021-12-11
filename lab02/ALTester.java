import ap.java.util;

public class ALTester {

	/*checks ascending order by returning false if any element is greater
	than the following one and true if there is no such case*/
	public static boolean orderCheck(ArrayList<Integer> aList) {
		for (int i = 0; i < aList.size()-1; i++) {
			if (aList.get(i) > aList.get(i+1)) { return false; }
		}
		return true;
	}

	/*sets each element of an ArrayList to a random integer on the
	interval [0,100)*/
	public static void populate(ArrayList<Integer> aList) {
		for (int i = 0; i < aList.size(); i++) {
			aList.set(i, (int)(Math.random() * 100));
		}
	}

}

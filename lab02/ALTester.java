/*
ABA - Ariella Katz, Alif Rahman, Brianna Tieu, Tom, Grippy, Pepe
APCS
Lab02 -- Well Al B. Sorted
2021-12-10
time spent: 0.5 hrs
*/

/*
DISCO:
0. ArrayList = ArrayList<Integer> will produce a warning saying that the code
   uses unsafe or unchecked operations because the first ArrayList is not
   necessarily an array of Integers. However, it's still allowed.
1. If you get the above warning, if you want more details (like what
   specifically caused the warning) you can enter javac -Xlint:unechecked
   Class.java into the terminal. (However, since it's just a warning, no
   further action is actually necessary.)
QCC:
0.
*/

import java.util.*;

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

	public static void main(String[] args) {
		
	}

}

/*
ABA - Ariella Katz, Alif Rahman, Brianna Tieu, Tom, Grippy, Pepe
APCS
Lab02 -- Well Al B. Sorted
2021-12-13
time spent: 0.5 hrs
*/

import java.util.ArrayList;

public class ALTester {

	/*checks ascending order by returning false if any element is greater
	than the following one and true if there is no such case*/
	public static boolean orderCheck(OrderedArrayList1 oAList) {
		for (int i = 0; i < oAList.size()-1; i++) {
			if (oAList.get(i) > oAList.get(i+1)) { return false; }
		}
		return true;
	}

	/*sets each element of an ArrayList to a random integer on the
	interval [0,100)*/
	public static void populate(OrderedArrayList1 oAList, int size) {
		for (int i = 0; i < size; i++) {
			oAList.addLinear((int)(Math.random() * 100));
		}
	}

	public static void main(String[] args) {
		OrderedArrayList1 test = new OrderedArrayList1();
		System.out.println("Printing empty OrderedArrayList1 test...");
		System.out.println(test);
		populate(test, 23);
		System.out.println("Printing populated OrderedArrayList1 test (populated with random ints)...");
		System.out.println(test);
		System.out.println("Is it ordered?");
		System.out.println(orderCheck(test));
		test.addBinary((int)(Math.random()*100));
		System.out.println("Printing OrderedArrayList1 test post-add...");
		System.out.println(test);
                System.out.println("Is it ordered?");
                System.out.println(orderCheck(test));
		test.remove(6);
		System.out.println("Printing OrderedArrayList1 test post-remove...");
		System.out.println(test);
                System.out.println("Is it ordered?");
                System.out.println(orderCheck(test));
	}

}

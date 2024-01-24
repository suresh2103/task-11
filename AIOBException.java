package task11;

import java.util.Arrays;

import java.util.*;

public class AIOBException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray = { 1234, 1589, 4687, 1547, 6556, 5445, 7896 };
		System.out.println("Elements in the array are:");
		System.out.println(Arrays.toString(myArray));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index of the required element:");
		int element = sc.nextInt();
		System.out.println("Element in the given index is ::" + myArray[element]);

	}

}

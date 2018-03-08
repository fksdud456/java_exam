package day12;

import java.util.ArrayList;

public class ConvertList {
	public static ArrayList<Integer> convertList(int array[]) {
		ArrayList<Integer> arrList = new ArrayList<>();
		for(int i = array.length-1 ; i>=0 ; i--) {
			arrList.add(array[i]);
		}
		return arrList;
	}
}

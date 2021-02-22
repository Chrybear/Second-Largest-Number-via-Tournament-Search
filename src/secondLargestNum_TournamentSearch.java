// Authors: Charles Ryan Barrett, 
// Date: 2/24/2021
// Description: A program that uses the tournament searching algorithm to find and return the second largest value in an entered int array.
// Made for CSC 541 assignment 2 at EKU


// Imports
import java.io.*; 
import java.util.*; 

public class secondLargestNum_TournamentSearch {
	
	public static int tournamentSearch(int[] array) {
		// Hashtable to store what indices are compared to each other
		Hashtable<Integer, Integer> compInd = new Hashtable<>(); 
		// key = value, item(s) are every value the key was compared to
		
		// call compareNums
		// while returned list > 1 item
		// call compareNums
		
		
		return 0; //Placeholder to prevent red lines
	}
	
	
	public static ArrayList<Integer> compareNums(int[] array) { //!!! Change to Take in arraylist and pass hashtable
		ArrayList<Integer> newArray = new ArrayList<Integer>(); //Array of winners that is returned
		//Is length of array divisible by 3?
		
		for (int x = 0; x < array.length - 1; x+=2) { 
			newArray.add(Math.max(array[x], array[x+1]));
			//Add array[x] and array[x+1] to hashtable
			//System.out.println(array[x]);  System.out.println(array[x+1]);
		}
		
		if (array.length%2 != 0) 
			newArray.add(array[array.length - 1]);
		
		
		for (int y = 0; y < newArray.size(); y++) {
			System.out.println(newArray.get(y));
		}
		
		return newArray;
	}                         
	
	public static void main(String[] args) {
		int[] testAr = {10, 4, 5, 8, 7, 2, 12, 3, 1, 6, 9, 11};
		int[] testAr2 = {1, 2, 3};
		ArrayList<Integer> test = compareNums(testAr);
		//test = compareNumes(test);
		
		
		}

	}



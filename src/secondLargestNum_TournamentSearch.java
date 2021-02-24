// Authors: Charles Ryan Barrett, Ethan Raby
// Date: 2/24/2021
// Description: A program that uses the tournament searching algorithm to find and return the second largest value in an int arraylist.
// Made for CSC 541 assignment 2 at EKU


// Imports
import java.io.*; 
import java.util.*; 

public class secondLargestNum_TournamentSearch {
	
	// Hashtable to store what indices are compared to each other
	static Hashtable<Integer, Integer> compInd = new Hashtable<>(); 
	
	public static int tournamentSearch(ArrayList<Integer> arrayL) {
		
		// Send array to comparing function
		while(arrayL.size() > 1) {
			arrayL = compareNumsAL(arrayL); //Continue loop until returned arraylist is a single item: the largest value of the original arraylist
		}
		
		//return the largest value
		//the largest value is now arrayL at 0	
		return arrayL.get(0);
	}
	
	
	public static ArrayList<Integer> compareNumsAL(ArrayList<Integer> nums) { 
		
		ArrayList<Integer> newArray = new ArrayList<Integer>(); //Array of winners that is returned

		for (int x = 0; x < nums.size() - 1; x+=2) { 
			
			// put (valueThatLost = key, valueLostTo = value)
			// add the winner to the arrayList
			if(nums.get(x) > nums.get(x+1)) {
				compInd.put(nums.get(x+1), nums.get(x)); //Adding to the global hashtable 
				newArray.add(nums.get(x));
			}
			else {
				compInd.put(nums.get(x), nums.get(x+1)); //Adding to the global hashtable
				newArray.add(nums.get(x+1));
			}
			
		}
		
		//If the length is odd, send the last value of the array on to the next round of checking
		if (nums.size()%2 != 0) 
			newArray.add(nums.get(nums.size()- 1));
		
//		//prints all winners; for testing only
//		for (int y = 0; y < newArray.size(); y++) {
//			System.out.print(newArray.get(y) + " ");
//		}
		
		return newArray;
	}
	
	public static int secondLargestNum_TournamentSearchHelper(ArrayList<Integer> AL) {
		int key = -1;
		
		if(AL.size() == 0) { //If Arraylist is empty, return -1 to denote an error
			System.out.println("You entered an empty array!");
			return -1;
			}
		else if(AL.size() == 1) { //If Arraylist only has 1 value, then by default it is second largest.
			System.out.print("Only one value: "+AL.get(0));
			return AL.get(0);
			
		}
		else {
			ArrayList<Integer> loser = new ArrayList<>();
			//find the largest value
			key = tournamentSearch(AL);

			Set<Integer> valuesThatLost = compInd.keySet();
			//for every value in the set, if it lost to the largest value, add to new array list for searching

			for(int x : valuesThatLost) {
				if(compInd.get(x) == key) {
					loser.add(x);
				}
			}
			return tournamentSearch(loser);
		}
		
	}
	
	public static void main(String[] args) {
	
		ArrayList<Integer> testArL = new ArrayList<>();
		Collections.addAll(testArL, 10, 4, 5, 8, 7, 2, 12, 3, 1, 6, 9, 11);
		int result = secondLargestNum_TournamentSearchHelper(testArL);
		if(result != -1) {
			System.out.println("The second largest value is: "+ result);
		}
	}

}



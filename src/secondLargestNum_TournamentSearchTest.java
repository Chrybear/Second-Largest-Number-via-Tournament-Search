import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

class secondLargestNum_TournamentSearchTest {
	//empty array
	@Test
	void testSecondLargestNum_TournamentSearch1() {
		secondLargestNum_TournamentSearch ts = new secondLargestNum_TournamentSearch();
		ArrayList<Integer> testArL = new ArrayList<>();
		int returnValue = ts.secondLargestNum_TournamentSearchHelper(testArL);
		assertEquals(-1, returnValue);
		
	}
	
	//even numbered array
	@Test
	void testSecondLargestNum_TournamentSearch2() {
		secondLargestNum_TournamentSearch ts = new secondLargestNum_TournamentSearch();
		ArrayList<Integer> testArL = new ArrayList<>();
		Collections.addAll(testArL, 10, 4, 5, 8, 7, 2, 12, 3, 1, 6, 9, 11);
		int returnValue = ts.secondLargestNum_TournamentSearchHelper(testArL);
		assertEquals(11, returnValue);
	}
	
	//odd numbered array
	@Test
	void testSecondLargestNum_TournamentSearch3() {
		secondLargestNum_TournamentSearch ts = new secondLargestNum_TournamentSearch();
		ArrayList<Integer> testArL = new ArrayList<>();
		Collections.addAll(testArL, 10, 4, 5, 8, 7, 2, 12, 3, 1, 6, 9, 11, 13);
		int returnValue = ts.secondLargestNum_TournamentSearchHelper(testArL);
		assertEquals(12, returnValue);
	}
	
	//array with 1 element
	@Test
	void testSecondLargestNum_TournamentSearch4() {
		secondLargestNum_TournamentSearch ts = new secondLargestNum_TournamentSearch();
		ArrayList<Integer> testArL = new ArrayList<>();
		Collections.addAll(testArL, 12);
		int returnValue = ts.secondLargestNum_TournamentSearchHelper(testArL);
		assertEquals(12, returnValue);
	}

}

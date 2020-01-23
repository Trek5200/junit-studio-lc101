package test;

import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BonusBinarySearchTest {

    int[] tempSearchArray = {1,2,3,4,5,6,7,8,9};

    @Test
    public void testForMiddle(){
        assertEquals(4, (BonusBinarySearch.binarySearch(tempSearchArray, 5)));
    }

    @Test
    public void testForLowest(){
        assertEquals(0, (BonusBinarySearch.binarySearch(tempSearchArray, 1)));
    }

    @Test
    public void testForLowHigh(){
        assertEquals(3, (BonusBinarySearch.binarySearch(tempSearchArray, 4)));
    }

    @Test
    public void testForLowMid(){
        assertEquals(2, (BonusBinarySearch.binarySearch(tempSearchArray, 3)));
    }
    @Test
    public void testForLowLow(){
        assertEquals(1, (BonusBinarySearch.binarySearch(tempSearchArray, 2)));
    }

    @Test
    public void testForHighLow(){
        assertEquals(5, (BonusBinarySearch.binarySearch(tempSearchArray, 6)));
    }
    @Test
    public void testForHighMid(){
        assertEquals(6, (BonusBinarySearch.binarySearch(tempSearchArray, 7)));
    }

    @Test
    public void testForHighHigh(){
        assertEquals(7, (BonusBinarySearch.binarySearch(tempSearchArray, 8)));
    }

    @Test
    public void testForOutLow(){
        assertEquals(-1, (BonusBinarySearch.binarySearch(tempSearchArray, 0)));
    }

    @Test
    public void testForHighest(){
        assertEquals(8, (BonusBinarySearch.binarySearch(tempSearchArray, 9)));
    }

    @Test
    public void testForOutHigh(){
        assertEquals(-1, (BonusBinarySearch.binarySearch(tempSearchArray, 10)));
    }


}

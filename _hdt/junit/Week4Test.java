
import static org.junit.Assert.*;

import org.junit.Test;

public class Week4Test {

	@Test
    public void testMax2Int1(){
    	assertEquals(0, Week4.max2Int(0, 0));
    }

    @Test
    public void testMax2Int2(){
    	assertEquals(0, Week4.max2Int(-1, 0));
    }

    @Test
    public void testMax2Int3(){
    	assertEquals(-1, Week4.max2Int(-1, -47));
    }

    @Test
    public void testMax2Int4(){
    	assertEquals(47, Week4.max2Int(47, 2));
    }

    @Test
    public void testMax2Int5(){
    	assertEquals(47, Week4.max2Int(0, 47));
    }

    @Test
    public void testMinArray1() {
        assertEquals(1, Week4.minArray(new int[] { 1, 2, 3 }));
    }    

    @Test
    public void testMinArray2(){
        assertEquals(47, Week4.minArray(new int[] { 47, 47, 47, 47, 47 }));
    }

    @Test
    public void testMinArray3(){
        assertEquals(-23, Week4.minArray(new int[] {0,42,4,12,566,8,6,-3,-15,-8,-23,0,0}));
    }

    @Test
    public void testMinArray4(){
        assertEquals(-1, Week4.minArray(new int[]{-1,-1,-1}));
    }

    @Test
    public void testMinArray5(){
        assertEquals(-47, Week4.minArray(new int[]{-46,0,-47}));
    }

    @Test
    public void testCalculateBMI1(){
        assertEquals("Bình thường", Week4.calculateBMI(57, 1.74));
    }

    @Test
    public void testCalculateBMI2(){
    	assertEquals("Béo phì", Week4.calculateBMI(65, 1.50));
    }

    @Test
    public void testCalculateBMI3(){
    	assertEquals("Bình thường", Week4.calculateBMI(60, 1.7));
    }

    @Test
    public void testCalculateBMI4(){
    	assertEquals("Thừa cân", Week4.calculateBMI(69, 1.69));
    }

    @Test
    public void testCalculateBMI5() {
    	assertEquals("Béo phì", Week4.calculateBMI(85, 1.74));
    }    

}

 package Week3;
import org.junit.Test;
import static org.junit.Arrest.*;




public class Week3Test {
    @Test
    

    
  
    public void testmax(){
        assertEquals(99,Week3.max(10,99));
        assertEquals(3,Week3.max(3,0));
        assertEquals(-15,Week3.max(-15,-20));
        assertEquals(4,Week3.max(4,-4));
        assertEquals(13,Week3.max(13,5));
    }
    @Test

    
    public void testminOfArray(){
        int[] array1={4, 5, 4, 23, 6, 78, 33};
        assertEquals(4, Week3.minOfArray(array1));
        int[] array2={-5, 45, 34, 22, 565};
        assertEquals(-5, Week3.minOfArray(array2));
        int[] array3={0, 43, 56454, 12, 4545};
        assertEquals(-0, Week3.minOfArray(array3));
        int[] array4={11, 22, 33, 44, 55, 66};
        assertEquals(11,Week3.minOfArray(array4));
        int[] array5={1, 434, 5, 345, 66,23};
        assertEquals(1,Week3.minOfArray(array5));
    }
    @Test
    

    
    public void testcalculateBMI(){
        assertEquals("Bình Thường", Week3.calculateBMI(54,1.60));
        assertEquals("Bình Thường", Week3.calculateBMI(43, 1.50));
        assertEquals("Thiếu cân", Week3.calculateBMI(40, 1.70));
        assertEquals("Béo phì", Week3.calculateBMI(75, 1.45));
        assertEquals("Thừa cân", Week3.calculateBMI(50, 1.45));
    }
}
    

    


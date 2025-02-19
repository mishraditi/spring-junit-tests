package junit;

import org.junit.jupiter.api.Test;
import java.lang.annotation.Target;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTest {

//    @Test
//    void test(){
//        int[] numbers ={};
//        array obj = new array();
//       int resullt = obj.sumOfArray(numbers);
//        System.out.println(resullt);
//        int expectedResult = 0;
//        assertEquals(expectedResult , resullt);
//    }
    @Test
    void test1(){
        array obj = new array();
      int result = obj.sumOfArray(new int[] {});
        assertEquals(0 , result);

    }
}
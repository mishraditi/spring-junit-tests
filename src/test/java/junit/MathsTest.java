package junit;

import junit.Maths;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    class MathsTest  {
        @Test
        void test (){
            int[] numbers ={1,2,3};
            Maths obj = new Maths();
            int sum =  obj.calculateSum(numbers);
            System.out.println( + sum);
            int expectedResult = 6;
            assertEquals(expectedResult , sum);
        }
    }

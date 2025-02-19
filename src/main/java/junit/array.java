package junit;

public class array {
    public int sumOfArray(int[] no){
        int sum = 0;
        for (int i = 0; i < no.length; i++) {
            sum = sum + no[i];
        }
        return sum;
    }
}

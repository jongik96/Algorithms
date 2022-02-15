import java.util.Arrays;

public class Cryptography{
    public long encrypt(int[] numbers){
		long answer = 1;
        Arrays.sort(numbers);
        numbers[0]++;
        for(int i=0; i<numbers.length; i++){
        	    answer *= numbers[i];
        }
        return answer;
    }
}

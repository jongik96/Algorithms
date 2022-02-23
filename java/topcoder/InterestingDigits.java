import java.util.*;
public class InterestingDigits{
    public int[] digits(int base){
        int max = base-1;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=2; i<=max; i++){
            if(max%i==0) ans.add(i);
        }
            
        int [] answer = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
        	answer[i] = ans.get(i);
        }
        
        return answer;
    }
}

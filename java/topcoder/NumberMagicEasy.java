
public class NumberMagicEasy{
    public int theNumber(String answer){
        int[] cardA = {1,2,3,4,5,6,7,8};
        int[] cardB = {1,2,3,4,9,10,11,12};
        int[] cardC = {1,2,5,6,9,10,13,14};
        int[] cardD = {1,3,5,7,9,11,13,15};
        
		
    	// 1에서 16까지 중에 해당하는 수 있는지 다 돌려보기
    	for(int i=1; i<=16; i++){
            if(isConfirmed(cardA, i) == answer.charAt(0)){
            	if(isConfirmed(cardB, i) == answer.charAt(1)){
                	if(isConfirmed(cardC, i) == answer.charAt(2)){
                		if(isConfirmed(cardD, i) == answer.charAt(3)){
                			return i;
            			}
            		}
            	}    
            }
        }
    	
        return 0;
    }
    char isConfirmed(int[] card, int i){
            for(int val : card){
            	if(val==i){
                	return 'Y';    
                }
            }
        	return 'N';
    }
}

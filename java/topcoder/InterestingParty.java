public class InterestingParty {
    public int bestInvitation(String[] first, String[] second){
        int length = first.length;  // firts 배열 길이
        int max = 0; 
        for(int i = 0; i<length; i++){
        	int fCount = 0, sCount = 0;
            for(int j = 0; j<length; j++){   // 
            	if(first[i].equals(second[j])) fCount++; 
                if(first[i].equals(first[j])) fCount++;
                if(second[i].equals(first[j])) sCount++;
                if(second[i].equals(second[j])) sCount++;
            }
          
            // 최댓값 비교
            if(max<fCount) max = fCount;
            if(max<sCount) max = sCount;
            
        }
        return max;
    }
}

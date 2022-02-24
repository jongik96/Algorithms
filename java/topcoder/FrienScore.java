public class FriendScore{
    public int highestScore(String[] friends){
        int answer = 0;
        int length = friends[0].length();
        
        for(int i=0; i<length; i++){
            int count = 0;
            for(int j=0; j<length; j++){
                if(i==j) continue;
                if(friends[i].charAt(j)=='Y'){
                    count++;
                }else{
                    for(int k=0; k<length; k++){
                        if(friends[j].charAt(k)=='Y' && friends[k].charAt(i) == 'Y'){
                            count++;
                        }
                    }
                }
            }
            
            answer = Math.max(answer, count);
        }
        return answer;
    }
}

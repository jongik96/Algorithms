function solution(participant, completion) {
    var answer = '';
    const all = participant.length;
    
    participant.sort(); //비교를 위해 정렬해준다.
    completion.sort(); // ''
    
    for(let i=0;i<all; i++){
        if(participant[i] != completion[i]){
            answer = participant[i];
             return answer;
        }
    }
    // return answer; 을 여기에 넣으면 중복된 값을 못받아오는것같다.
    
}

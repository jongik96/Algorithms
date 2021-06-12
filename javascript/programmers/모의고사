function solution(answers) {
    var answer = [];
   
    const a1 = [1,2,3,4,5];
    const a2 = [2,1,2,3,2,4,2,5];
    const a3 = [3,3,1,1,2,2,4,4,5,5];
    
    let count = [0, 0, 0];
    
    for(let i=0; i<answers.length; i++){
        if(answers[i] === a1[i%a1.length]){
            count[0]++;
        }
        if(answers[i] === a2[i%a2.length]){
            count[1]++;
        }
        if(answers[i] === a3[i%a3.length]){
            count[2]++;
        }
    }
    
    const max = Math.max(...count);
    for(let i =0; i<3; i++){
        if(count[i] === max){
            answer.push(i+1)
        }
    }
    return answer;
}

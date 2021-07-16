function solution(d, budget) {
    var answer = 0;
    d.sort((a,b) => a-b);  //오름차순 정렬
    //console.log(d);
    for(let i=0; i<d.length; i++){
        if(budget-d[i]>=0){
            
            budget = budget-d[i]
            answer++;
            console.log(budget);
        }
        if(budget-d[i]<0)
            break;
    }
    
    return answer;
}

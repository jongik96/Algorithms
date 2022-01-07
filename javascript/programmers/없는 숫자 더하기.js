function solution(numbers) {
    var answer = 45;
    numbers.sort();
    for(let i=0; i<10; i++){
        for(let j=0; j<numbers.length; j++){
            if(i==numbers[j]){
                answer -= i;
            }
        }
    }
    
    return answer;
}

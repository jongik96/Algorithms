function solution(array, commands) {
    var answer = [];
    let x = 0;
    let y = 0;
    let z = 0;
    for(let i = 0; i<commands.length; i++){
        x = commands[i][0];
        y = commands[i][1];
        z = commands[i][2];
        
        let sliced = array.slice(x-1,y);
        let sorted = sliced.sort((a,b) => a - b)
        answer.push(sorted[z-1]);
    }
    
    return answer;
}

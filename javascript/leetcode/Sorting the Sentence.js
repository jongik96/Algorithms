var sortSentence = function(s) {
    
    s = s.split(" ");
    let num = [s.length]
    let arr=[];
    for(let i=0; i<s.length; i++){
        arr[i]= s[i].split("");
        num[i] = arr[i].pop();
    }
    let answer = [s.length];
    for(let i=0; i<num.length; i++){
        arr[i] = arr[i].join('');
        answer[num[i]-1] = arr[i];
    }
    return answer.join(" ");
};

function solution(n) {
    var answer = 0;
    let arr = [];
    for(let i=1; i<=n; i++) arr.push(i); // 1부터 n까지의 수가 있는 배열 생성
    
    for(let i=1; i*i<n; i++){
        if(arr[i]){
            let num = arr[i];
            for(let j=num*num; j<=n; j+=num){
                arr[j-1]=0;
            }
        }
    }      // 1을 제외한 수들의 배수들을 제외하는 방식
    answer = arr.filter((number) => number);
    answer.shift();   // shift()는 배열의 첫번째요소를 삭제한다.
    return answer.length;
}

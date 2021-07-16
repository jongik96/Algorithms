function solution(n, arr1, arr2) {
    let answer = [];
    // 2진수로 변환한 데이터를 담을 배열 선언
    let binary1 = [];
    let binary2 = [];
    for(let i=0; i<n; i++){
        binary1[i] = getBinary(arr1[i], n);
        binary2[i] = getBinary(arr2[i], n);
    }
    
    for(let i=0; i<n; i++){
        let s = '';
        for(let j=0; j<n; j++){
            if(binary1[i][j] === '#' || binary2[i][j] === '#'){  // 둘중에 하나라도 # 이면 #으로
                s += '#';
            }else {
                s += ' ';
            }
        }
        answer[i] = s;
    }
    return answer;
}

function getBinary(number, n){
    let s = '';
    // 각 자리의 2의 제곱 구하기 ( 가장 큰 자리수 부터 )
    let square = 1;
    for(let index=1; index<n; index++){
        square *= 2;
    }
    // 계속 나눌 수 있는지 판단하여 해당 자릿수에 '#', ' '채우기
    for(let i=0; i<n; i++){
        if(number/square >=1){
            s += '#';
            number -= square;
        }else{
            s += ' ';
        }
        square /= 2;
    }
    return s;
}

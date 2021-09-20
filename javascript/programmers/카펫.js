function solution(brown, yellow) {
    /*
    갈색격자의 수 brown, 노란색 격자의 수 yellow
    카펫의 가로, 세로 크기를 순서대로 배열에 담아 return
    카펫의 가로길이는 세로길이보다 길거나 같다
    */
    let answer = [];
    let sum = brown + yellow;
    console.log(sum)
    for(let i = Math.floor(sum/2); i>0; i--){
        // 연산을 줄이기 위해 총 넓이를 2로 나눈 값부터 반복문을 시작한다.
        if((sum%i)!=0){
            continue;
            // 나머지가 0이 되지않으면 무시하고 넘긴다.
        }else if(sum%i==0){
          // 나머지가 0이 될 경우에
        let width = i;
        let height = sum/i;
            if((width - 2) * (height - 2) === yellow){
                // yellow칸의 갯수가 전체 넓이에서 brown칸을 뺀 것과 동일한지 비교가 필요했다.
                return [width, height];
            }
        }
    }
}

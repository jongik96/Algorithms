function solution(sizes) {
    const height = [];   // 가로 세로 중에 큰 값을 넣을 배열
    const width = [];    // 가로 세로 중에 작은 값을 넣을 배열
    sizes.map(([s0, s1]) => {
        if(s0 > s1){
            width.push(s0);
            height.push(s1);
        }else{
            height.push(s0);
            width.push(s1);
        }
    })
    return Math.max(...width) * Math.max(...height);
    // 회전시킨 다음엔 임의로 정한 세로들 중에서 최댓값, 가로들 중에서 최댓값 곱하기
}

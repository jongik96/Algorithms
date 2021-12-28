function solution(s) {
    var answer = [];
    //var list = s.replace("{{","");
    //list = list.replace("}}","");
    //list = list.split("},{");
    
    // 특수문자를 제외한 숫자들만 남기기
    var list = s.replace("{{","").replace("}}","").split("},{");

    // list의 원소를 넣어줄 배열 생성
    var listArr = [];
    for(let i=0; i<list.length; i++){
        listArr.push(list[i].split(","));
    }
    //for(let i of listArr){
    //    console.log(i);
    //}
    
    //listArr 정렬
    listArr.sort((a,b) => {
        if(a.length > b.length){
            return 1;
        }else {
            return -1;
        }
    });
    
    // listArr의 모든 원소들을 answer 배열에 담은 뒤 중복 요소를 제거하면 될까?
    for(let i=0; i<listArr.length; i++){
        for(let j=0; j<listArr[i].length; j++){
            answer.push(listArr[i][j]);
        }
    }
    
    // 중복된 요소 제거
    answer = Array.from(new Set(answer));
    
    // 문자형을 숫자형으로 변환
    for(let i=0; i<answer.length; i++){
        answer[i] = Number(answer[i]);
    }
    return answer;
}

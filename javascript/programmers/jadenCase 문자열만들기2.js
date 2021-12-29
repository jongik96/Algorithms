function solution(s) {
  // 모든 문자를 소문자로 변경
    s = s.toLowerCase();
    var answer = '';
  
    for(let i=0; i<s.length; i++){
  	// 첫번째 위치와 공백 뒤의 글자를 대문자로 변경한 뒤 answer 배열에 추가
      if(i === 0 || s[i-1] === " "){
          answer += s[i].toUpperCase();
      }
      // 해당되지 않는 경우는 그대로 소문자로 answer 배열에 추가
      else {
          answer += s[i];
      }
    }
    return answer;  
}

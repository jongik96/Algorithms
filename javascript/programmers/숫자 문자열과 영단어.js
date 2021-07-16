/*
다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.

1478 → "one4seveneight"
234567 → "23four5six7"
10203 → "1zerotwozero3"
이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ s의 길이 ≤ 50
s가 "zero" 또는 "0"으로 시작하는 경우는 주어지지 않습니다.
return 값이 1 이상 2,000,000,000 이하의 정수가 되는 올바른 입력만 s로 주어집니다.
입출력 예
s	result
"one4seveneight"	1478
"23four5six7"	234567
"2three45sixseven"	234567
"123"	123

입출력 예 #3
"three"는 3, "six"는 6, "seven"은 7에 대응되기 때문에 정답은 입출력 예 #2와 같은 234567이 됩니다.
입출력 예 #2와 #3과 같이 같은 정답을 가리키는 문자열이 여러 가지가 나올 수 있습니다.
입출력 예 #4
s에는 영단어로 바뀐 부분이 없습니다.
제한시간 안내
정확성 테스트 : 10초
*/

function solution(s) {
    var answer = 0;
    
    s = s.replace(/one/g,'1');
    s = s.replace(/two/g,'2');
    s = s.replace(/three/g,'3');
    s = s.replace(/four/g,'4');
    s = s.replace(/five/g,'5');
    s = s.replace(/six/g,'6');
    s = s.replace(/seven/g,'7');
    s = s.replace(/eight/g,'8');
    s = s.replace(/nine/g,'9');
    s = s.replace(/zero/g,'0');
    
    console.log(s);
    s = Number(s);
    return s;
}

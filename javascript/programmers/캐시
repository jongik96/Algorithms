/*
어피치에게 시달리는 제이지를 도와, DB 캐시를 적용할 때 캐시 크기에 따른 실행시간 측정 프로그램을 작성하시오.

입력 형식
캐시 크기(cacheSize)와 도시이름 배열(cities)을 입력받는다.
cacheSize는 정수이며, 범위는 0 ≦ cacheSize ≦ 30 이다.
cities는 도시 이름으로 이뤄진 문자열 배열로, 최대 도시 수는 100,000개이다.
각 도시 이름은 공백, 숫자, 특수문자 등이 없는 영문자로 구성되며, 대소문자 구분을 하지 않는다. 도시 이름은 최대 20자로 이루어져 있다.
출력 형식
입력된 도시이름 배열을 순서대로 처리할 때, "총 실행시간"을 출력한다.
조건
캐시 교체 알고리즘은 LRU(Least Recently Used)를 사용한다.
cache hit일 경우 실행시간은 1이다.
cache miss일 경우 실행시간은 5이다.
입출력 예제
캐시크기(cacheSize)	도시이름(cities)	실행시간
3	["Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"]	50
3	["Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"]	21
2	["Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"]	60
5	["Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"]	52
2	["Jeju", "Pangyo", "NewYork", "newyork"]	16
0	["Jeju", "Pangyo", "Seoul", "NewYork", "LA"]	25
*/

function solution(cacheSize, cities) {
  // cache가 없을 경우
    if(cacheSize === 0) return cities.length * 5
    var queue = []
    var answer = 0
    
    // 모두 대문자로 바꿔줌
    let cities2 = cities.map(v=>v.toUpperCase())
 
    for(var i =0;i<cities2.length;i++){
        if(queue.length<cacheSize){ //큐가 cacheSize보다 작을때
            if(queue.indexOf(cities2[i])>=0){
                answer++
                queue.push(queue.splice(queue.indexOf(cities2[i]),1)[0])
            }
            else{
                queue.push(cities2[i])
                answer+=5
            }
        }
        else{  // 큐가 cacheSize보다 클 때
            if(queue.indexOf(cities2[i])>=0){
                answer++
                queue.push(queue.splice(queue.indexOf(cities2[i]),1)[0])
            }
            else{
                answer+=5
                queue.shift()
                queue.push(cities2[i])
            }
        }
     
    }
    return answer
}

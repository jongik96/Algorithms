function solution(people, limit) {
  let answer = 0;
  people.sort(function (a, b) {
    return b - a;
  });
// 먼저 사람들을 몸무게가 무거운 순으로 정렬한다
  for (let i = 0, j = people.length - 1; i <= j; i++) {
    if (people[i] + people[j] > limit) {
      answer++;
    } else {
      answer++;
      j--;
    }
  }
// 2명의 무게가 구명보트 한도보다 적으면 구명보트수 하나 추가(answer+1),
  // 아니면 마지막 태울사람을 다시 빼두고 구명보트 수 하나 추가(answer+1)
  return answer;
}

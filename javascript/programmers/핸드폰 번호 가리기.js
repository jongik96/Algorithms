function solution(phone_number) {
    var answer = '';
    answer = phone_number.replace(/\d(?=\d{4})/g, "*");

    return answer;
}

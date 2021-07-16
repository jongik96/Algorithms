// 첫번째 방법
function solution(n)
{
    var answer = 0;

    let str = n.toString();
    let str_split = str.split('');
    for(let i=0; i<str_split.length; i++){
        answer += parseInt(str_split[i]);
    }

    return answer;
}

// 두번째 방법
function solution(n)
{
    var answer = 0;
    let str = n.toString();
    for(let i=0; i<str.length; i++){
        answer += parseInt(str[i]);
    }

    return answer;
}

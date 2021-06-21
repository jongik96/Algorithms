function solution(numbers, hand) {

    const pos = {  // 좌표를 나타내는 객체를 생성한다.
        1: [0, 0], 2: [0, 1], 3: [0, 2],
        4: [1, 0], 5: [1, 1], 6: [1, 2],
        7: [2, 0], 8: [2, 1], 9: [2, 2],
        '*': [3, 0], 0: [3, 1], '#': [3, 2]
    };
    var lH = '*', rH = '#';   // 왼쪽엄지와 오른쪽엄지의 초기값 설정
    var result = ''
    for (var num of numbers){
        if (num % 3 === 1){
            result += 'L';
            lH = num;   //왼쪽엄지의 위치를 해당숫자로 바꿔준다.
        }         // 1,4,7을 누르는 경우
        
        else if (num !==0 && num % 3 === 0){
            result += 'R';
            rH = num; //오른쪽엄지의 위치를 해당숫자로 바꿔준다.
        }     // 3,6,9를 누르는 경우
        else{
            result += dis(num, lH, rH, pos, hand)
            result[result.length-1] === 'L'? lH = num : rH = num  // 손가락의 현재위치를 다시 설정
        }
    }

    return result;
}
        
    function dis(num, lH, rH, pos, hand){   //왼손잡이 or 오른손잡이인지 판별하는 함수
    const lD = Math.abs(pos[lH][0] - pos[num][0]) +   // 왼쪽엄지에서 해당값까지 거리의 절대값을 구한다.
        Math.abs(pos[lH][1] - pos[num][1])
    const rD = Math.abs(pos[rH][0] - pos[num][0]) +  // 오른쪽엄지에서 해당값까지 거리의 절대값을 구한다.
        Math.abs(pos[rH][1] - pos[num][1])
    
    if (lD === rD) return hand === 'left' ?  'L' : 'R'; // 거리가같은 경우에 왼손잡이이면 'L'을 리턴, 오른손잡이이면 'R'을 리턴한다.
    return lD < rD ? 'L' : 'R'    
    }

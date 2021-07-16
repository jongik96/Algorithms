function solution(nums) {
    let answer = 0;
    
    // 숫자 3개 선택
    const len = nums.length;
    for (let i = 0; i < len; i++){
        for (let j = i+1; j < len; j++){
            for (let k = j+1; k < len; k++) {
                const number = nums[i]+nums[j]+nums[k];
                if (isPrime(number))
                    answer++;
            }
        }
    }

    // 소수 판별 2~number까지 비교
    function isPrime(number){
        if (number < 2) return true;
        for (let i = 2; i < number; i++){
            if (number % i == 0) return false;
        }
        return true;
    }
    
    return answer;
}

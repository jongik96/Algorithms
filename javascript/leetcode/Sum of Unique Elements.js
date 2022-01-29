var sumOfUnique = function(nums) {
    let bool = Array(nums.length);
    for(let i=0; i<bool.length; i++){
        bool[i] = true;
    }
    for(let i=0; i<nums.length-1; i++){
        for(let j=i+1; j<nums.length; j++){
            if(nums[i]==nums[j]){
                bool[i] = false;
                bool[j] = false;
            }
        }
    }
    let answer = 0;
    for(let i=0; i<nums.length; i++){
        if(bool[i] == true){
            answer += nums[i];
        }
    }
    return answer;
};

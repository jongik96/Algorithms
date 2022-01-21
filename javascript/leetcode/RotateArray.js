var rotate = function(nums, k) { 
    for(let i = 0 ; i<k; i++){
       let temp = nums[nums.length-1];
        for(let j=nums.length-1; j>=1; j--){
            nums[j]= nums[j-1]
        }
        nums[0] = temp;
    }
    
    let arr = [...nums];
    let length = nums.length;
    for(let i=0; i<length; i++){
        let index = (i+k) % length;
        nums[index] = arr[i];
    }
    
    
    return nums
};

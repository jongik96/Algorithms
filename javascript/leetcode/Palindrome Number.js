/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {

    // 숫자 x 를 문자열로 변환
    x = x.toString();

    // 변환된 문자열 x를 배열로 나누기
    let arr = x.split("");

    // 배열(문자열)의 길이가 홀수일 때
    if(arr.length%2==1) {
        let half = Math.floor(arr.length/2);
        let arr1 = [];
        let arr2 = [];

        for(let i=0; i<half; i++){
            arr1[i] = arr[i];
        }
        for(let i=arr.length-1; i>half; i--){
            arr2[arr.length-1-i] = arr[i];
        }

        for(let i=0; i<arr1.length; i++) {
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
        
    // 배열(문자열) 의 길이가 짝수일 때
    } else if(arr.length%2==0){
        let half = arr.length/2-0.5;
        let arr1 = [];
        let arr2 = [];
        for(let i=0; i<half; i++){
            arr1[i] = arr[i];
        }
        for(let i=arr.length-1; i>half; i--){
            arr2[arr.length-1-i] = arr[i];
        }
        for(let i=0; i<arr1.length; i++) {
            if(arr1[i]!=arr2[i]) return false;
        }

        return true;
    }
};

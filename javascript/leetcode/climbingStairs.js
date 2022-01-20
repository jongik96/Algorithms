var climbStairs = function(n) {
    if(n==1) return 1;
    else if(n==2) return 2;
    else{
        let answer=2;

        let plus_pre = 0;
        let plus_cur = 1;
        let plus_last = 0;

        for(let i=3; i<=n; i++){
            plus_last = plus_pre + plus_cur;
            plus_pre = plus_cur;
            plus_cur = plus_last;
            answer+=plus_last;

        }
        return answer;
    }
};

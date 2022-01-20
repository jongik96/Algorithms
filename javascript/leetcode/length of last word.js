var lengthOfLastWord = function(s) {
    s= s.trim();

    let str = s.split(" ");

    let lastValue = str[str.length-1];

    let length = 0;

    for(let i=0; i<lastValue.length; i++){
        //if(lastValue[i] != " ")
        length++;
    }
    return length;
    
};

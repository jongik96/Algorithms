
var arrayStringsAreEqual = function(word1, word2) {
    let str1='', str2='';
    if(word1.length>=2){
        str1 = word1.join('');
    }else{
        str1 = word1[0]    
    }
    
    if(word2.length>=2){
        str2 = word2.join('');
    }else{
        str2 = word2[0];
    }
    console.log("str1 => "+str1+" str2 => "+str2)
    if(str1 === str2){
        return true
    }else {
        return false;
    }
};

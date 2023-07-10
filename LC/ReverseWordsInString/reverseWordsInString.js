/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    let result = "";
    let words = s.split(" ");
    for(let i = words.length-1; i>=0; i--){
        let wordToAdd = words[i].trim();
        result+=wordToAdd;
        if(wordToAdd !== ""){
            result+=" ";
        }
    }
    //result = result.substr(0, result.length-1);
    result =result.trim();
    return result;
};
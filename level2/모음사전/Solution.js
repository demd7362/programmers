function solution(word){
    const getPowSumArray = () => {
        const length = DICTIONARY_WORD.length;
        return Array.from({length: length}, (val,index) => {
            let sum = 1;
            for(let i = 1; i <= index; i++){
                sum += Math.pow(length,i);
            }
            return sum;
        }).reverse();
    }
    const powSumArray = getPowSumArray();
    let sum = word.length;
    for(let i = word.length - 1; i>=0; i--){
        const alphabet = word[i]; // E
        const target = powSumArray[i]; // 1
        const multipleValue = DICTIONARY_WORD.indexOf(alphabet);
        sum += target * multipleValue;
    }
    return sum;
}

function solution(ingredients) { 
    let answer = 0;
    const stack = [];
    const findWord = '1231';
    const len = findWord.length;

    for(const ingredient of ingredients){
        stack.push(ingredient);
        if(stack.length < len) continue;
        const word = stack.slice(-len).join('');
        if(word === findWord){
            stack.splice(-len);
            answer++;
        }
    }
    return answer;
}

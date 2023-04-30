function solution(s) {
    const original = s;
    let f = s.substring(0,1);
    let cnt = 0;
    const arr = [];
    let split = s.split('');
    let tmp = 0;
    loop:
    while(arr.join('') !== original){
        for(let i = 0; i<split.length; i++){ // ccabba
            const word = split[i];
            cnt += word === f? 1:-1;
            if(!cnt){
                arr.push(s.substring(0,i+1));
                tmp = i+1;
                s = s.substring(tmp);
                split = s.split('');
                f = s.substring(0,1);
                continue loop;
            } else if(split.length  === cnt){
                arr.push(word);
                break loop;
            }
        }
    }
    return arr.length;
}

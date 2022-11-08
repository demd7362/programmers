function solution(s) {
    let count = 0;
    for (let i = 0; i < s.length; i++) {
        if (s.charAt(i) == 'p' || s.charAt(i) == 'P') count++;
        if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') count--;
    }
    return (count == 0) ? true : false;
}

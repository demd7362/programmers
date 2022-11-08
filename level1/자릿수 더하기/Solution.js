function solution(n) {
    let sum = 0;
    let arr = n.toString();
    for (let i = 0; i < arr.length; i++) {
        sum += parseInt(arr[i]);
    }
    return sum;
}

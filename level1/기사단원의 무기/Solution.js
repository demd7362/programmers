function solution(number, limit, power) {
    const divisors = new Array(number).fill(0);

    for (let i = 1; i <= number; i++) {
        for (let j = i; j <= number; j += i) {
            divisors[j - 1]++;
        }
    }
    for (let i = 1; i <= number; i++) {
        if (divisors[i - 1] > limit) {
            divisors[i - 1] = power;
        }
    }
    return divisors.reduce((x,y)=>x+y);
}

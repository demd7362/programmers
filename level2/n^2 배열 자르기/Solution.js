function solution(n, left, right) {
    return Array(right - left + 1).fill(0).map((_,i)=>{
        i += left;
        const row = Math.floor(i / n);
        const col = i % n;
        return Math.max(row, col) + 1;
    })
}

function solution(X, Y) {
    const getHash = (numStr) => {
        const hash = {};
        for (const digit of numStr) {
            hash[digit] = (hash[digit] || 0) + 1;
        }
        return hash;
    }
    const exists = [];
    const YMap = getHash(Y);

    for (const num of X) {
        if (YMap[num] > 0) {
            exists.push(num);
            YMap[num] -= 1;
        }
    }


    if (exists.length === 0) {
        return "-1";
    }
    if (Number(exists.join('')) === 0) {
        return "0";
    }
    return exists.sort((a, b) => b - a).join('');
}

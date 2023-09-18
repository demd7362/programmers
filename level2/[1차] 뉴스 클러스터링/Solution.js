function solution(str1 = 'handshake', str2 = 'shake hands') {
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    const strToArr = str => {
        const arr = [];
        for (let i = 0; i < str.length - 1; i++) {
            const word = str.substring(i, i + 2);
            if (/[^a-z]/.test(word)) continue;
            arr.push(word);
        }
        return arr;
    }

    const arr1 = strToArr(str1);
    const arr2 = strToArr(str2);
    const unionSet = new Set([...arr1, ...arr2]);
    let intersectionCount = 0;
    let unionCount = 0;
    unionSet.forEach(word => {
        const len1 = arr1.filter(x => x === word).length;
        const len2 = arr2.filter(x => x === word).length;
        intersectionCount += Math.min(len1, len2);
        unionCount += Math.max(len1, len2);
    })
    const tmp = unionSet.size === 0 ? 1 : intersectionCount / unionCount;
    return Math.floor(tmp * 65536);
}

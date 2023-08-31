function solution(numbers = [7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2], hand = 'left') {
    const hands = {
        left: [3, 0], // x,y
        right: [3, 2] // x,y
    }
    const arrays = {
        left: [1, 4, 7],
        center: [2, 5, 8, 0],
        right: [3, 6, 9]
    }
    let result = '';
    const find = (val) => {
        const indexOf = (arrayName) => {
            const idx = arrays[arrayName].indexOf(val);
            return idx === -1 ? undefined : [arrayName, idx];
        }
        return indexOf('left') || indexOf('center') || indexOf('right');
    }
    const getDistance = (arr1, arr2) => {
        return Math.abs(arr1[0] - arr2[0]) + Math.abs(arr1[1] - arr2[1]);
    }
    for (const number of numbers) {
        const [arrayName, idx] = find(number);
        switch (arrayName) {
            case 'left': hands.left = [idx, 0];
                result += 'L';
                break;
            case 'center':
                const leftDistance = getDistance(hands.left, [idx, 1]);
                const rightDistance = getDistance(hands.right, [idx, 1]);
                if (leftDistance < rightDistance || (leftDistance === rightDistance && hand === 'left')) {
                    hands.left = [idx, 1];
                    result += 'L';
                } else {
                    hands.right = [idx, 1];
                    result += 'R';
                }
                break;
            case 'right': hands.right = [idx, 2];
                result += 'R';
                break;
        }
    }
    return result;
}

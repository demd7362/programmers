function solution(dartResult = "1D2S3T*") {
    const indexMap = {};
    for (let i = 0, j = 0; i < 3; i++) {
        const match = dartResult.match(/[#*]/);
        if (match !== null) {
            const option = match[0];
            let index = match.index;
            if (index >= 3 && index < 5) {
                index = 5;
            } else if (index > 5) {
                index = 8;
            }
            indexMap[index] = option;
            dartResult = dartResult.replace(/[#*]/, '');
            j++;
        }
    }
    const multiple = (value, area) => {
        value = Number(value);
        switch (area) {
            case 'D': return Math.pow(value, 2);
            case 'T': return Math.pow(value, 3);
            default: return value;
        }
    }
    let scores = dartResult.match(/(\d+[SDT])/g);
    scores = scores.map((score) => {
        const match = score.match(/(\d+)(\D+)/);
        const [_, value, area] = match;
        return multiple(value, area);
    });

    for (const [key, value] of Object.entries(indexMap)) {
        if (key === '2') {
            scores[0] *= value === '#' ? -1 : 2;
            continue;
        }
        if (key === '5') {
            if (value === '#') {
                scores[1] *= -1;
            } else {
                scores[0] *= 2;
                scores[1] *= 2;
            }
            continue;
        }
        if (key === '8') {
            if (value === '#') {
                scores[2] *= -1;
            } else {
                scores[1] *= 2;
                scores[2] *= 2;
            }
        }
    }
    return scores.reduce((acc, score) => acc + score);
}

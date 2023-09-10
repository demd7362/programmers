const score = {
    1: 3,
    2: 2,
    3: 1,
    4: 0,
    5: -1,
    6: -2,
    7: -3
}

const typeMapping = {
    RT: [0, -1],
    TR: [0, 1],
    CF: [1, -1],
    FC: [1, 1],
    JM: [2, -1],
    MJ: [2, 1],
    AN: [3, -1],
    NA: [3, 1]
};
function solution(survey = ["AN", "CF", "MJ", "RT", "NA"], choices = [5, 3, 2, 7, 5]) {
    const order = ["RT", "CF", "JM", "AN"];
    const result = Array(order.length).fill(0);
    for (let i = 0; i < choices.length; i++) {
        const [idx, multiple] = typeMapping[survey[i]];
        result[idx] += (score[choices[i]] * multiple);
    }
    return result.map((type, index) => type <= 0 ? order[index][0] : order[index][1]).join('');
}

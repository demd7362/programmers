function solution(n, m, section) {
    let max = -1;
    return section.reduce((acc, sector) => {
        if (sector > max) { // 최대로 칠할 수 있는 범위를 초과한다면 +1, 최대로 칠할 수 있는 범위값을 재설정
            max = sector + m - 1;
            return acc + 1;
        }
        return acc; // 최대로 칠할 수 있는 범위 내라면 아무것도 안한다
    }, 0)
}

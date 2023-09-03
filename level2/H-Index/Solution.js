function solution(citations) {
    return citations.sort((a, b) => a - b).reduce((acc, citation,idx) => {
        return Math.max(Math.min(citation,citations.length-idx),acc);
    },0)
}

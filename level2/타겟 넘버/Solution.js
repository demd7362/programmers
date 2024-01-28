function solution(numbers, target) {
    let count = 0;
    let front = 0;
    const bfs = () => {
        const queue = [{
            number: numbers[0],
            index: 1,
        },
            {
                number: -numbers[0],
                index: 1,
            }
        ];
        while (front < queue.length) {
            const {number, index} = queue[front++];
            if(numbers.length === index){
                if(number === target){
                    count++;
                }
            }
            else if(index < numbers.length){
                queue.push({
                    number: number + numbers[index],
                    index: index + 1,
                });
                queue.push({
                    number: number + (-numbers[index]),
                    index: index + 1,
                });
            }
        }
    }
    bfs();
    return count;
}

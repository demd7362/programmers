function solution(wallpaper = ['.#...', '..#..', '...#.']) {
    let left = [Infinity, Infinity];
    let right = [-Infinity, -Infinity];
    for (let y = 0; y < wallpaper.length; y++) {
        for (let x = 0; x < wallpaper[y].length; x++) {
            const target = wallpaper[y][x];
            if (target === '#') {
                left = [Math.min(left[0], y), Math.min(left[1], x)];
                right = [Math.max(right[0], y), Math.max(right[1], x)];
            }
        }
    }
    return [...left, right[0] + 1, right[1] + 1];
}

function insertSong(sortedSongs, newSong) { 
    const insertionIndex = sortedSongs.findIndex(song => newSong.play > song.play);
    if (insertionIndex >= 0) {
        // 더 높은 재생 횟수를 가진 노래 앞에 새 노래 삽입
        sortedSongs.splice(insertionIndex, 0, newSong);
    } else {
        // 만약 새 노래가 가장 재생 횟수가 적으면 맨 끝에 추가
        sortedSongs.push(newSong);
    }
}

function solution(genres = ["classic", "pop", "classic", "classic", "pop"], plays = [500, 600, 150, 800, 2500]) {
    // 장르별 총 재생 횟수 계산
    const genreSum = genres.reduce((acc, genre, index) => {
        acc[genre] = (acc[genre] || 0) + plays[index];
        return acc;
    }, {});

    // 장르별로 노래 정보를 배열로 모으고, 재생 횟수에 따라 정렬
    const genreMap = genres.reduce((acc, genre, index) => {
        const song = { index, play: plays[index] };
        if (!acc[genre]) {
            acc[genre] = [song];
        } else {
            insertSong(acc[genre], song);
        }
        return acc;
    }, {});

    // 각 장르별로 가장 많이 재생된 노래 2개씩 선택
    const topSongs = Object.keys(genreMap)
        .sort((a, b) => genreSum[b] - genreSum[a]) // 총 재생 횟수에 따라 장르를 정렬
        .flatMap(genre => genreMap[genre].slice(0, 2)); // 장르별 상위 2개 노래 선택
    
    // 선택된 노래의 인덱스를 배열로 반환
    return topSongs.map(song => song.index);
}

function solution(genres, plays) {
    const getSecondBest = (genres) => {
        genres.sort((a, b) => b.play - a.play);
        return genres[1];
    }
    const genreSum = genres.reduce((acc,genre,index) => {
        acc[genre] = (acc[genre] || 0) + plays[index];
        return acc;
    },{});
    const orderedGenreSum = Object.entries(genreSum)
        .sort(([aKey,aValue],[bKey,bValue]) => bValue - aValue)
        .map(([key,value]) => key);
    
    genres = genres.reduce((acc, genre, index) => {
        let genres = acc[genre] ?? [];
        const play = plays[index];
        if (genres.length >= 2) {
            const {play: secondPlayValue, index: secondPlayIndex} = getSecondBest(genres);
            if (play < secondPlayValue || (play === secondPlayValue && index < secondPlayIndex)) {
                return acc;
            }
            genres = genres.filter(genre => genre.index !== secondPlayIndex);
        }
        genres.push({play, index, genre});
        acc[genre] = genres;
        return acc;
    }, {})
    genres = Object.entries(genres).reduce((acc, [key, value]) => {
        acc.push(value);
        return acc;
    }, []).flat();
    genres = genres
        .sort((a,b) => b.play - a.play)
        .sort((a,b) => {
            const aValue = orderedGenreSum.findIndex(genre => genre === a.genre);
            const bValue = orderedGenreSum.findIndex(genre => genre === b.genre);
            return aValue - bValue;
        })
        .map(genre => genre.index);
    return genres;
}

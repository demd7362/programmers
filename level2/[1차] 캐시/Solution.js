function mapSolution(cacheSize, cities) {
    const CACHE_HIT_DURATION = 1;
    const CACHE_MISS_DURATION = 5;
    const cache = new Map();
    if (cacheSize === 0) return cities.length * CACHE_MISS_DURATION;
    return cities.reduce((acc,city)=>{
        city = city.toLowerCase();
        if(cache.has(city)){
            acc += CACHE_HIT_DURATION;
            cache.delete(city);
        } else {
            acc += CACHE_MISS_DURATION;
        }
        cache.set(city,true);
        if(cache.size > cacheSize) {
            const key = cache.entries().next().value[0];
            cache.delete(key);
        }
        return acc;
    },0)
}

function arraySolution(cacheSize, cities) {
    const CACHE_HIT_DURATION = 1;
    const CACHE_MISS_DURATION = 5;
    const cache = [];
    if (cacheSize === 0) return cities.length * CACHE_MISS_DURATION;
    return cities.reduce((acc,city)=>{
        city = city.toLowerCase();
        const index = cache.indexOf(city);
        if(index !== -1){
            acc += CACHE_HIT_DURATION;
            cache.splice(index,1);
        } else {
            acc += CACHE_MISS_DURATION;
        }
        cache.push(city);
        if(cache.length > cacheSize) cache.shift();
        return acc;
    },0)
}

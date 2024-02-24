function initializeMap(gifts) {
    const map = {};
    gifts.forEach(gift => {
        const [giver, receiver] = gift.split(' ');
        if (!map[giver]) map[giver] = { giftTo: {}, giftScore: 0 };
        if (!map[receiver]) map[receiver] = { giftTo: {}, giftScore: 0 };

        map[giver].giftTo[receiver] = (map[giver].giftTo[receiver] || 0) + 1;
        map[giver].giftScore += 1;
        map[receiver].giftScore -= 1;
    });
    return map;
}
function solution(friends , gifts) {
    const map = initializeMap(gifts);
    const scores = friends.reduce((acc, friend) => {
        acc[friend] = 0;
        return acc;
    }, {})


    for (const me of Object.keys(map)) {
        const targetFriends = map[me].giftTo;
        const nonTargetFriends = [...Object.keys(targetFriends), me];
        const rest = friends.filter((friend) => !nonTargetFriends.includes(friend));
        for (const [friend, myGiftCount] of Object.entries(targetFriends)) {
            const friendGiftCount = map[friend].giftTo[me];

            if(myGiftCount > (friendGiftCount ?? 0)){
                scores[me]++;
            } else if(myGiftCount === friendGiftCount){
                const friendGiftScore = map[friend].giftScore;
                const myGiftScore = map[me].giftScore;
                if(myGiftScore > friendGiftScore){
                    scores[me]++;
                }
            }
        }
        for(const friend of rest){
            if(map[friend]?.giftTo[me] === undefined){
                const friendGiftScore = map[friend]?.giftScore ?? 0;
                const myGiftScore = map[me].giftScore;
                if(myGiftScore > friendGiftScore){
                    scores[me]++;
                }
            }
        }
    }
    return Math.max(...Object.values(scores));
}


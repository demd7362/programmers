function solution(bandage, health, attacks) {
    const attackTiming = attacks.reduce((acc,attack) => {
        const [timing,damage] = attack;
        acc[timing] = damage;
        return acc;
    },{})
    const MAX_HEALTH = health;
    const [castingTime, regenPerSec, additionalRegen] = bandage;
    const len = attacks[attacks.length - 1][0];
    let casting = 0;
    const updateHealth = (value) => {
        health = Math.min(value + health, MAX_HEALTH);
        if (health <= 0) {
            throw new Error('You Are Dead');
        }
    }
    const bandaging = (damage) => {
        if (damage) {
            updateHealth(-damage);
            casting = 0;
        } else {
            updateHealth(regenPerSec);
            casting++;
            if (casting === castingTime) {
                updateHealth(additionalRegen);
                casting = 0;
            }
        }
    }
    for (let i = 0; i <= len; i++) {
        const damage = attackTiming[i];
        try {
            bandaging(damage);
        } catch(e){
            return -1;
        }
    }
    return health;
}

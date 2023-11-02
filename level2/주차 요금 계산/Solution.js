function solution(fees, records) {
    const [basicTime, basicFee, addTime, addFee] = fees;
    const logs = records.reduce(
        (acc, record) => {
            const [time, carNumber, status] = record.split(' ');
            const targetLog = acc[status === 'IN' ? 0 : 1];

            targetLog[carNumber] ??= [];
            targetLog[carNumber].push(time);

            return acc;
        },
        [{},{}],
    );
    const [come, out] = logs;

    const toMinutes = hhmm => {
        const [hh,mm] = hhmm.split(':');
        return Number(hh) * 60 + Number(mm);
    }
    const getMaxAllowNaN = (num1,num2) => {
        if(num1 === undefined) return num2;
        if(num2 === undefined) return num1;
        return Math.max(num1,num2);
    }
    const calculateFee = minutes => {
        return minutes < basicTime ? basicFee : basicFee + (Math.ceil((minutes - basicTime) / addTime) * addFee);
    }

    return Object.entries(come).sort(([aKey,_],[bKey,$])=> aKey - bKey).map(([carNumber,inTimes = []])=>{
        const outTimes = out[carNumber] ?? [];
        const maxLength = getMaxAllowNaN(inTimes?.length,outTimes?.length);
        let minutes = 0;
        for(let i = 0; i<maxLength; i++){
            const inTime = inTimes[i];
            const outTime = outTimes[i];
            minutes += toMinutes(outTime ?? '23:59') - toMinutes(inTime);
        }
        return calculateFee(minutes);
    })
}

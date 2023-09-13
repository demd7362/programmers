function solution(today, terms, privacies) {
    const LAST_DAY = 28;
    const TOTAL_MONTH_PER_YEAR = 12;
    const dateToDays = (date, addMonth = 0) => {
        let [year, month, day] = date.split('.').map(Number); // Number로 바로 변환 -> 함수 참조
        month += addMonth + year * TOTAL_MONTH_PER_YEAR;
        return day + month * LAST_DAY;
    }
    const types = Object.fromEntries(terms.map(term => {
        const [type, invalidMonth] = term.split(' ');
        return [type, Number(invalidMonth)];
    })); 
  // reduce를 사용하는 것보다 코드도 깔끔하고, return {...acc,[type]: Number(invalidMonth)}; 보다 성능적으로도 개선되었다

    const nowDays = dateToDays(today);
    return privacies.reduce((acc, privacy, index) => {
        const [date, type] = privacy.split(' ');
        const targetDays = dateToDays(date, types[type]);
        if (nowDays >= targetDays) {
            acc.push(index + 1);
        }
        return acc;
    }, []);
}

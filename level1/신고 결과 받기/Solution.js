function solution(id_list, reports, k) {
    reports = [...new Set(reports)];
    const idCounter = Object.fromEntries(id_list.map(id => [id, 0]));

    const reportMap = reports.reduce((acc, report) => {
        const [id, targetId] = report.split(' ');
        const existingEntry = acc[targetId];

        if (existingEntry) {
            existingEntry.count++;
            existingEntry.by.push(id);
        } else {
            acc[targetId] = { count: 1, by: [id] };
        }
        return acc;
    }, {});

    Object.values(reportMap).forEach(info => {
        const { count, by } = info;
        if (count >= k) {
            by.forEach(reporter => {
                idCounter[reporter]++;
            })
        }
    })
    return Object.values(idCounter);
}

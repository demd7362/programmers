function solution(new_id) {
    new_id = (new_id.toLowerCase()
        .replace(/[^a-z0-9-_.]/g, '')
        .replace(/\.{2,}/g, '.')
        .replace(/^\.|(\.$)/g, '') || 'a')
        .substring(0, 15)
        .replace(/\.$/,'');
    const len = new_id.length;
   
    return len > 2 ? new_id : new_id + new_id[len-1].repeat(3-len);
}

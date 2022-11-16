def solution(arr):
    min = arr[0]
    if len(arr) == 1:
        return [-1]
    for i in arr:
        if (i <= min):
            min = i
    arr.remove(min)
    return arr

  # 배열의 최솟값 min(arr)

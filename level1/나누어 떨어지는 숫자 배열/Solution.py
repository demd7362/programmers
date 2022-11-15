def solution(arr, divisor):
    answer = list()
    for i in arr :
        if(i%divisor == 0) : answer.append(i)
    if len(answer) < 1 : return [-1]
    return sorted(answer)
  
  # [i for i in range(0,5)] == [0,1,2,3,4] 
  # for문을 바로 배열에 담을 수도 있구나

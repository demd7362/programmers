def solution(absolutes, signs):
    sum = 0
    for i in range(0, len(absolutes)):
        sum += (absolutes[i] if signs[i] == True else -absolutes[i])
    return sum

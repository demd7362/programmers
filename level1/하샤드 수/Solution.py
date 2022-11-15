def solution(x):
    num_list = list(str(x))  # JAVA의 tocharArray()
    sum = 0
    for i in num_list:
        sum += int(i)
    return True if (x % sum == 0) else False

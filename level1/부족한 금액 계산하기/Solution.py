def solution(price, money, count):
    required = sum([price*i for i in range(1, count+1)]) - money
    return max(required, 0)

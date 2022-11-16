def divisible(number):
    cnt = 0
    for i in range(1, number+1):
        if (number % i == 0) : cnt += 1
    return cnt

def solution(left, right):
    sum = 0
    for i in range(left, right+1):
        sum += +i if divisible(i) % 2 == 0 else -i
    return sum
  
  # 약수가 홀수개인 모든 수는 제곱 수
  # int(i**0.5) == i**0.5

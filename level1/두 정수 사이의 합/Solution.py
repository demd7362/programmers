def solution(a, b):
    return sum(range(a if a<b else b,b+1 if a<b else a+1))
  

def solution(s):
    cnt = 0
    for i in s :
        cnt += 1 if i == '(' else -1
        if cnt < 0 : return False
    return True if cnt == 0  else False
      

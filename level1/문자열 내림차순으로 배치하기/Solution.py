def solution(n):
    return int(''.join(sorted(str(n),reverse=True))) 
  # sorted 메소드는 배열을 리턴하기 때문에 list로 감싸줄 필요가 없다

  

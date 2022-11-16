def solution(s):
    return ''.join(sorted([i for i in s], reverse=True))

# sorted 메소드는 list뿐만 아니라 문자열도 정렬해주므로 [i for i in s] 대신 s가 들어가도 됩니다

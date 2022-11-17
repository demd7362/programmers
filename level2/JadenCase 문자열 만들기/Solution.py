def solution(s):
    s_list = list(s)
    firstNum = True
    for i in range(len(s_list)):
        s_list[i] = s_list[i].upper() if firstNum == True else s_list[i].lower()
        firstNum = True if s_list[i] == ' ' else False
    return ''.join(s_list)

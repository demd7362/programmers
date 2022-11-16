def solution(s):
    list = s.split(' ')
    intList = [int(list[i]) for i in range(len(list))]
    return str(min(intList))+' '+str(max(intList))
  
  '''
  def solution(s):
    li = list(map(int, s.split()))
    return f'{min(li)} {max(li)}'
  '''

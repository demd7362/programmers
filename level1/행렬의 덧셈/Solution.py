def solution(arr1, arr2):
    return [[k+l for k, l in zip(i, j)]for i, j in zip(arr1, arr2)]

N = int(input())

num = [int(x) for x in input().split()]
lst = []

for i in range(N):
    arr = []
    for j in range(1,num[i]):
        if num[i] % j == 0:
            arr.append(j)     
    if len(arr) == 1:
        lst.append(num[i])

print(len(lst))
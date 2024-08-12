N, K = map(int, input().split())
arr = []

for _ in range(1, N+1):
    if N % _ == 0 :
        arr.append(_)


if len(arr) < K:
    print(0)
else:
    print(arr[K-1])
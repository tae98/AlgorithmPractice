import sys
from itertools import combinations

input = sys.stdin.readline
lst = []

for _ in range(9):
    
    lst.append(int(input()))
    
for i in combinations(lst, 7):
    if sum(i) == 100:
        break

for each in range(len(i)):
    print(sorted(i)[each])
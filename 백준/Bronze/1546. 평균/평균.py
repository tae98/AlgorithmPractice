import sys
num = int(sys.stdin.readline())

score = list(int(x) for x in sys.stdin.readline().split())
max_score = max(score)
lst = []

for each in score:
    new_score = (each/max_score)*100
    lst.append(new_score)

total = sum(lst)
average = total / num

print(average)


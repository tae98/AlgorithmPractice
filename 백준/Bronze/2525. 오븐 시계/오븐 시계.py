H,M = [int(x) for x in input().split()]

C = int(input())

hour = (M + C) // 60
min = (M + C) % 60

if (C + M >= 60):
    if (H + hour >= 24):
        H -= 24
    H = H + hour
    print(H, min)

else:
    if (H >= 24):
        H -= 24
    print (H,  M + C)
    
        
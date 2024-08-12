x, y, w , h = map(int, input().split())

xdif = w - x
ydif = h - y

dist_list = [x, y, xdif, ydif]

print(min(dist_list))
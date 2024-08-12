word = input().lower()
word_lst=list(set(word))
count_lst =[]

for each in word_lst:
    count = word.count(each)
    count_lst.append(count)

    
if count_lst.count(max(count_lst)) >= 2 :
    print('?')
else:
    print(word_lst[(count_lst.index(max(count_lst)))].upper())
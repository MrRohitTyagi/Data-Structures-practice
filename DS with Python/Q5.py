# Q5. To find minimum and maximum number in user given list.


l1 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 156, 13, 14, 15, 16, 17, 18, 19, 20]

max = 0
min = 0

for i in l1:
    if(i > max):
        max = i
min = max

for i in l1:
    if(i < min):
        min = i


print("Maximim :", max)
print("Minimum :", min)

print(" enter numbers with space in between example => 23 34 456 765")
inp =  str(input())

L = inp.split(" ")

for i in L:
    num = int(i)
    if(num % 2 == 0):
        print(num)
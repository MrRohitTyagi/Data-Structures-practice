

print(" enter numbers with space in between example => 23 34 456 765")
inp =  str(input())

L = inp.split(" ")


for item in L:
    var = int(item)
    if(var >1):
        for num in range(2,var):
            if(var % num  == 0):
                break
        else: print(var) 

    

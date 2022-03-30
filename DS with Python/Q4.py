# Q4. To find prime number in given user list using python

l1 = [10,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]

for item in l1:
    if(item >1):
        for num in range(2,item):
            if(item % num  == 0):
                break
        else: print(item)    
    
 
# Q6. To print even number and odd number from 1 to 10

even = []
odd = []

for i in range(1,11):
    
    if(i % 2 == 0):
        even.append(i)
    else:
        odd.append(i)    

print("Even : ",even)
print("Odd : ",odd)
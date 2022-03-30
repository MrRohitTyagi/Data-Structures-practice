L =[]

print("enter => stop <= to stop the program from taking input ")
while True:
    inp = input()
    if inp == 'stop':
        break
    L.append(int(inp))


max = 0

for i in L:
    if max<i:
        max = i

print( "max of all inputs is : ",max)
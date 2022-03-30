# Q7. Print the following pattern
#    *
#    * *
#    * * *
#    * * * *

star = 1
space = 3

for i in range(4):
    for j in range(star):
        print('*',end=" ")
    for k in range(space):
        print(" ",end=" ")

    star = star + 1
    space = space - 1
    print('\r')

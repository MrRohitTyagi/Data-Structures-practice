# Q19- Write a program to generate the following patterns.
#       $ * * * *
#       * $     *
#       *   $   *
#       *     $ *
#       * * * * $

for i in range(5):
    for j in range(5):
        if(i==j):
            print('$', end = ' ')

        elif(i == 0 or i == 4 or j == 0 or j == 4):
            print('*', end = ' ')
        
        else:
            print(' ', end = ' ')    
    print()
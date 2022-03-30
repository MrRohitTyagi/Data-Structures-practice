for i in range(5):
    for j in range(5):
        if(i==j or  j == 4-i ):
            print('$', end = ' ')

        elif(i == 0 or i == 4 or j == 0 or j == 4):
            print('*', end = ' ')
        
        else:
            print(' ', end = ' ')    
    print()
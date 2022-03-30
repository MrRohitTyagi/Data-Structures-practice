


def fact(n):
    if(n == 0):
        return 1

    ans = fact(n-1)
    myans = ans * n
    return myans   

var = int(input())    

ans = fact(var)
print(ans)
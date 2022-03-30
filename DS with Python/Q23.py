# num = int(input())

def facto(n):
    
    if(n==0):
        return 1

    ans = facto(n-1)
    myans = n *  ans
    return myans

ans = facto(7)
print(ans )
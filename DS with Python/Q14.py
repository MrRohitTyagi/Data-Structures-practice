# Q14- Write a program that prompts the user to enter five words. If the length of any word is less than
# 6 characters, then it asks the user to enter it again. However, if the word is of 6 or more characters,
# then it displays it on the screen

L = []

while len(L) != 5:
    st = str(input())
    if len(st) < 6:
        print("enter again Length is smaller than 6")
    else:
        L.append(st);    

print("names: " ,L)
        
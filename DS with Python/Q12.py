# Q12- Write a program that counts the number of lowercase characters, uppercase characters, and
# digits entered by the user.

st = str(input())



Lowercase = 0
uppercase = 0
digits =0
for i in st:
    if i.islower():
        Lowercase +=1
    elif i.isupper():
        uppercase += 1
    elif i.isdigit():
        digits += 1  

print("lowerCase : " ,Lowercase)
print("UpperCase : " ,uppercase)
print("Digits : " ,digits)
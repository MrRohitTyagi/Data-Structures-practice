# Q11- Write a program that determines whether a digit, uppercase, or a lowercase character was
# entered.

var = input()

if var.isupper():
    print("UpperCase")
elif var.islower():
    print("LowerCase")
elif var.isdigit():
    print("digit")
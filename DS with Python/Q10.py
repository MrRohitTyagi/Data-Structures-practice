# Q10- Write a program that determines whether an alphabet, digit or a whitespace was entered.


var = input()

if( var.isalpha()): 
    print("alphabet")

elif( var.isdigit()):
    print("digit")

elif( var == ' '):
    print("Whitespace") 

else: print("Wrong Input")           
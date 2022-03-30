# Write a program to sum the series 1²/1 + 2²/2 + 3²/3 +...+n'²/n.
# 
inp = int(input())

sum1 = 0
for i in range(1,inp+1):
    sum1 = sum1 + (i*i)/i

print(sum1)
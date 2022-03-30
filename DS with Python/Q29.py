from logging import exception


inp = int(input())

try:
    if( inp < 18 or inp > 99):
        raise Exception("age is not correct")

raise Exception("not good")

except Exception as e:
    print("exceptions handled")
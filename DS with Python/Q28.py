try:
    print(a)
    print(h)

except SyntaxError:
    print("Syntax error occured")

except NameError:
    print("NameError Occured")

except IndentationError:
    print("IndentationError Occured")
    
except Exception as e:
    print("ERROR")


print("Rest Program Execuited")
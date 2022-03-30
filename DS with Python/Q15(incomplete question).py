X_Percentage= int(input("Enter X Percentage : "))
if X_Percentage < 80:
    print("Not eligible for PG course")
    exit()

XII_Percentage= int(input("Enter XII Percentage : "))

if XII_Percentage < 80:
    print("Not eligible for PG course")
    exit()

Graduation_Percentage= int(input("Enter Graduation Percentage : "))

if Graduation_Percentage < 70:
    print("Not eligible for PG course")
    exit()

print("Congrats Yout are eligible for PG course")
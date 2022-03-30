# Q16- Write a program to calculate parking charges of vehicle. Enter the type of vehicle as a
# character (like c for car, b for bus, etc.) and number of hours, then calculate charges as given below:
# Truck/bus-20rs per hour
# Car -10rs per hour
# Scooter/Cycle/ Motor cycle – 5rs per hour



print("Enter the type of vehicle : ")
print("-C- for car || -T- for Truck || -B- for Bus || -W-  for two wheelers  ")
inpW = str(input(" => ")).upper()
inpT = int(input("number of hours : "))

if (inpW == 'T' or inpW == 'B'):
    print(f"parking cost for {inpT} hours : " , 20*inpT)

elif(inpW == 'W'):
    print(f"parking cost for {inpT} hours : " , 5*inpT)

elif(inpW == 'C'):
    print(f"parking cost for {inpT} hours : " , 10*inpT)

else:
    print("wrong input")
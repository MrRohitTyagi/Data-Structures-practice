import time
import timeit

t = time.localtime()
current_time = time.strftime("%H:%M:%S", t)


print("Enter the type of vehicle : ")
print("-C- for car || -T- for Truck || -B- for Bus || -W-  for two wheelers  ")
inpW = str(input(" => ")).upper()


    
inpT = int(input("number of hours : "))
start = timeit.default_timer()

print(f"vehicle entered the parking at {current_time} ")
print("to Leave the parking type -EXIT-")
LeaveParking = str(input()).upper()
if(LeaveParking == "EXIT"):
    t = time.localtime()
    current_time = time.strftime("%H:%M:%S", t)
    print(f"Vehicle left at {current_time}")
    if (inpW == 'T' or inpW == 'B'):
        if(inpT < 3 ):
            print(f"parking cost for {inpT} hours : " , 20*inpT)
        else:        
            print(f"parking cost for {inpT} hours : " , 30*inpT)

    elif(inpW == 'W'):
        if(inpT<3):
            print(f"parking cost for {inpT} hours : " , 5*inpT)
        else:
            print(f"parking cost for {inpT} hours : " , 10*inpT)

    elif(inpW == 'C'):
        if(inpT<3):
            print(f"parking cost for {inpT} hours : " , 10*inpT)
        else:
            print(f"parking cost for {inpT} hours : " , 20*inpT)

    else:
        print("wrong input")
stop = timeit.default_timer()

sec= int(stop-start)

min =0
hr =0
if(sec>=60):
    while sec >= 60:
        sec -= 60
        min += 1
        if(min >= 60):
            while min >= 60:
                min -= 60
                hr += 1

print(f"Vehicle parked for : {hr} hours  {min} minutes and {sec} seconds")
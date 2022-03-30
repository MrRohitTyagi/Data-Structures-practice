# Operations on Strings, Lists , tuples and arrays
# a. Creating lists/tuple/array and accessing list elements using index
# b. Access the list/tuple element using –ve index
# c. Extract specific element from list/tuple/array
# d. Use len(), del(), remove() and range functions on list/tuple
# e. Applying different searching and sorting algorithm on data (list)

print('----------------a--------------')

L = [1,2,3,4,5,6,7,8,9]
print(L[0])
print(L[1])
print(L[2])
print(L[3])

print('----------------b--------------')

print(L[-1])
print(L[-2])
print(L[-3])
print(L[-4])

print('----------------c--------------')

for i  in L:
    if i >3 and i< 9:
        print(i)

print('----------------d--------------')   

print("Lenght of List is :",len(L))
 
L.remove(5)
print(L)
 
del L[4]
print(L)


L2 = [*range(20)]
print(L2)

L3 = ['rohit','shivang','tapasvi','shubham']

for i in L3:
    if "a" in i:
        L3.remove(i)
print(L3)        

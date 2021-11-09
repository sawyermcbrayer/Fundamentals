#CSC120
# lab10Template
import random
import statistics
def fill( lx, nx, x, y):
    # Populate list of size = nx with random integers
    # in the range x  y
    # this code needs to be adjusted does NOT address duplicates
    lx = []
    j = 0
    while (j < nx):
      randNum = random.randint(x, y)
      if randNum not in lx:
            lx.append(randNum)
            j = j + 1
      else:
          continue
    return lx

def display(lx):
    # NEEDS to be FIXED
    # display 5 lines with each line containing only 5 integers
    
    print(" 2 the list == ")
    print(lx[:5])
    print(lx[5:10])
    print(lx[10:15])
    print(lx[15:20])
    print(lx[20:25])

def maxValue(lx):
    # NEEDS to be FIXED
    # call max function with lx
    # return the largest value in the list
    # use the min value available in python
    mx = max(lx)
    return mx

def minValue(lx):
    # NEEDS to be FIXED
    # return the smallest value in the list lx
    # use the min function available in python
    smallest = min(lx)
    return smallest

def ave(lx):
    # NEEDS to be FIXED
    # return the average of the integers in the list lx
    # must call the sum() function here and
    # divide by the size of the list
    sumHere = sum(lx)
    average = sumHere/25
    return average

def sum(lx):
    # NEEDS to be FIXED
    # return the sum of the integers in the list lx
    #it will be used in the ave() function
    s = 0
    for i in range(len(lx)):
        s = s + lx[i]
    return s

def div3(lx):
    # NEEDS to be FIXED
    # return the number of integers in the list lx
    # that are divisible by 3 with no remainder i.e. x % 3 == 0
    t = 0
    for i in range(len(lx)):
        if (lx[i] % 3) == 0:
            t = t + 1
    return t

def evens(lx):
    # NEEDS to be FIXED
    # return the number of even integers in list lx
    e=0
    for i in range(len(lx)):
        if (lx[i] % 2) == 0:
            e = e + 1
    return e

def odds(lx):
    # NEEDS to be FIXED
    # return the number of odd integers in list lx
    o = 0  # WRONG fix this
    for i in range(len(lx)):
        if (lx[i] % 2) != 0:
            o = o + 1
    return o

def digit1x(lx):
    # NEEDS to be FIXED
    # return the number of integers in list lx start with  1
    temp = 0
    for i in range(len(lx)):
        if lx[i] > 9 and lx[i] < 20:
            temp = temp + 1
    return temp

def digitx1(lx):
    # NEEDS to be FIXED
    # return the number of integers in list lx end with 1
    temp = 0
    for i in range(len(lx)):
        if (lx[i] % 10)==1:
            temp = temp + 1
    return temp

def median(lx):
    # NEEDS to be FIXED
    # return the median integer in the list lx
    x = statistics.median(lx)
    return x

def sortDescending(lx):
    # NEEDS to be FIXED
    # sort lx largest to smallest
    # NEEDS to be IMPLEMENTED
    # call python sort function with lx
    lx.sort(reverse=True)
    return lx
def maxMinAverage(minx, maxx):
    # NEEDS to be FIXED
    # average the minx == return values from a call to the minValue      function and
    # maxx == return value from the maxValue functions
    minmaxAve = (maxx + minx) / 2
    return minmaxAve

def FirstLast(x, y):       # note
    # NEEDS to be FIXED
    #  x = return value of minValue() **max
    #  y = return value of maxValue()  **min
    # create an integer z consisting of the first digit
    # of x and
    # the last digit of y  # FIX
    x = str(x)
    y = str(y)
    x = x[1]
    y = y[0]
    z = y+x
    z = int(z)
    return z

def IsFirstLastinMyList(lx, zx):
    # NEEDS to be FIXED
    #  zx = return value of function FirstLast()
    #  if zx in lx let s =‘Yes’
    # other wise s = 'No'
    s = "nopeee..."
    for i in lx:
        if zx in lx:
            s = "Yes!"
    return s

# NOW we call the functions
n = 25
a = 10
b = 60
myList = [ ]
myList = fill (myList, n,a,b)
display(myList)

#display the list in descending sorted order
myList = sortDescending(myList)
print("3 the sorted array largest to smallest is   ", myList)

# sum mlx min average
max = maxValue(myList)
min = minValue(myList)
average = ave(myList)
s = sum(myList)
# even and odds
e = evens(myList)
o = odds(myList)
print( "4  Sum ==  ", s)
print( "5  Minimum ", min)
print( "6  Maximum == ", max)
print( "7  Average == ", average)
print("8 the number of even integers == ", e )
print("9 the number of odd integers ==  ", o)

# as a first digit and 1 as a last digit
x = digit1x(myList)
print("10 the number of integers that start with the digit 1 == ", x)
y = digitx1(myList)
print("11 the number of integers that end with the digit 1 == ", y)

# number of didgits divisible by 3
z = div3(myList)
print("12 the number of integers divisible by 3 with no remainder == ", z)

#median calculations
m = median(myList)  # return value m from the median function  
print("13 the median of the list is  ", m)

#average of min and mlx
mave = maxMinAverage(max, min)
print("14 the average of the maximum and minimum  ", mave)

z = FirstLast(max, min)
print("15 the integer formed by first digit + lastdigit == ",z)

s = IsFirstLastinMyList(myList, z)
print('16 Is the integer ', z, ' in MyList Y/N?',s)
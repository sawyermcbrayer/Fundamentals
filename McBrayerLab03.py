import random
a = -50  
b = 50    
x = random.randint(a,b) 	#  returns an integer a <= x <= b 
y = random.randint(a,b) 	#  returns an integer a <= y <= b 
z = random.randint(a,b) 	#  returns an integer a <= z <= b 
w = random.randint(a,b) 	#  returns an integer a <= w <= b 
print('1 random integers == ', x,' ',y,' ', z, ' ', w )
print("Max #: " , max(x , y , z , w))
print("Min #: ", min(x , y , z , w))
counter = 0
if ((x%2) == 0):
    counter = counter + 1
if ((y%2) == 0):
    counter = counter + 1
if ((z%2) == 0):
    counter = counter + 1
if ((w%2) == 0):
    counter = counter + 1
print("There are ", counter , "even numbers...")
counter = 0
if ((x%2) != 0):
    counter = counter + 1
if ((y%2) != 0):
    counter = counter + 1
if ((z%2) != 0):
    counter = counter + 1
if ((w%2) != 0):
    counter = counter + 1
print("There are ", counter , "odd numbers...")
counter = 0
if (-25 < x and x < 25):
    counter = counter + 1
if (-25 < y and y < 25):
    counter = counter + 1
if (-25 < z and z < 25):
    counter = counter + 1
if (-25 < w and w < 25):
    counter = counter + 1
print("There is/are " , counter , "number/s greater than -25 and less than 25!")
counter = 0 
if (x > 0):
    counter = counter + 1
if (y > 0):
    counter = counter + 1
if (z > 0):
    counter = counter + 1
if (w > 0):
    counter = counter + 1
print("There is/are " , counter , "number/s greater than 0!")
counter = 0
if (x < 0):
    counter = counter + 1
if (y < 0):
    counter = counter + 1
if (z < 0):
    counter = counter + 1
if (w < 0):
    counter = counter + 1
print("There is/are " , counter , "number/s less than 0!")
avgOne = max(x , y , z , w)
avgTwo = min(x , y , z , w)
avgMinMax = (avgOne + avgTwo) / 2
print("The average of the highest and lowest numbers is: " , avgMinMax)
totalAvg = (x + y + z + w) / 4
print("The average of all numbers is: " , totalAvg)






import random
import math
temp = -1
n = 50
nn = 1000 # note nn*n == 50000

# Theoretical calculations
print('======Theoretical results (what is expected) ==========')
#Using the Binomial distribution formulas on page 1
p = .5
meanAvg = (50000*p)
print('1 the theoretical mean(average)of 1''s ( n*nn*p) ==', meanAvg)  # fix u == n*nn*p this is the expected (average number of 1’s
theoVariance = 50000*p * (1-p)
print('2 the theoretical variance v  == ', theoVariance)      # fix
# v = n*nn*p*(1-p)
stdDeviation = math.sqrt(50000*p * (1-p))
print('3 the standard deviation SD (should be > 100)  == ', stdDeviation)
#  sd = square root(v) sd = sqrt(v)
#  at this point in the code
#  we have the theoretical mean, variance, standard deviation
# now for the experimental results
print(' ========== Experimental results ========== ')
print(' ========== Populate a list and count 1’s  ========== ')
temp = -1
a = 0
b = 1
MyList = []
j = 0
while (j < nn):    # loop for 1000 times
    i = 0
    while i < n :    # loop 50 times populate list of nn
        randNum = random.randint(a,b)
        MyList.append(randNum)
       #  count the number of 1’s and the number of 0
        #  use the count function
       #  the number of 1’s + number 0’s == 50
        #  keep track of these counts and update the results
       # with the next iteration
        i = i +1
    j = j + 1
myListLength = len(MyList)
print('4 the length of MyList == ', myListLength   )       # FIX use len()
letterX = MyList.count(1)
print('5 the number of 1’s is ', letterX  )       # FIX
letterY = MyList.count(0)
print('6 the number of 0’s is ', letterY  )        # fix
listSum = sum(MyList)
sumAvg = listSum / myListLength
print('7 the average of all the ', n*nn,' integers  is...',
        'should be < 1) ', sumAvg)         # fix

# fix SD = sqrt(v)

# Display the range (+- 2sd ) as follows:
# mean+ 2*SD  mean – 2*SD
stdDeviationTwo = stdDeviation * 2
stdDeviationThree = stdDeviation * (-2)
print('8 mean - 2*SD == ', stdDeviationThree)    #fix
print('9 mean + 2*SD == ', stdDeviationTwo)    #fix
# Answer the question:
# is the total number of 1’s from 5 above
#  mean – 2*SD < mean < mean + 2*SD true ?  Yes or no 
# within the range as calculated in 8 and 9 by printing
#‘Yes’ if it is within the range  and
# ‘No’   if it is not within the range
answer = 'NO'
if (24776.4 < letterX < 25223.6):
    answer = ' YES !'

print('10 Is the number of 1''s within ave +- 2*SD ', answer)  # FIX 

#Display 10 lines, 25 integers per line of the n*nn (== 50000) integers
# That is, display the integers in MyList, 25 per line, for 10 lines
# and include the line number as in 1 , 2, 3, …10
# NOTE only display 10 lines with 25 values (= 0 or 1)
# and not all 50,000 integers
print('11 displaying 10 numbered lines with 25 integers per line ...')
# for your consideration will need adjustments
k = 0
sub = []
counter = 1
while (k < 10 ):
    sub = MyList[k: k+25]    # Splice
    print("...", counter , sub)      # do NOT print k only the
                                # line number as in 1, 2,3
    counter = counter + 1
    k = k+1


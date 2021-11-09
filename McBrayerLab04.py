fee = 0.0	# initialize  
f1 = 5.0  	# table 1 fee
f2 = 4.0		# table 2 fee
f3 = 2.0		# table 3 fee
multiplier = 0
multiplierIncrease = 0
m = int(input(" Please enter number of minutes parked..."))
if (0 < m and m <= 60 ):      	#table 1 minutes
  #  hrs = int(m/60) + 1
    fee = f1
    print("Parking fee for ", m, " minutes is $", fee)
# now for table 2
elif (m > 60 and m <= 300):    	# table 2
    # calculations needed
    if (60 < m and m <= 120):
        multiplier = 2
    elif (120 < m and  m <= 180):
        multiplier = 3
    elif (180 < m and m <= 240):
        multiplier = 4
    elif (240 < m and m <= 300):
        multiplier = 5
    fee = f2 * multiplier
    print('Your parking fee amounts to: ', fee)
elif ( m > 300):			# table 3 
    #calculations needed
    multiplierIncrease = round(m / 60)
    multiplierIncrease = multiplierIncrease + 1
    if ((m % 100 == 0)):
        multiplierIncrease = multiplierIncrease - 1
    fee = f3 * (multiplierIncrease)
    print('Your parking fee amounts to: ', fee)
    print(multiplierIncrease)
else:
    print("error  negative minutes", m )

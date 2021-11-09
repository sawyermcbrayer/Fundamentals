# User input and error checking of hours:
hours = int(input("Enter current hour: "))
looper = 1
while looper == 1:
    if (hours > 12 or hours < 1):       
        looper = 1
        hours = int(input("Invalid selection, please choose from 1-12: "))
    elif (hours >= 1 or hours <= 12):
            looper = 0
# User input and error checking of mins:
mins = int(input("Enter current minute: "))
looper = 1
while looper == 1:
    if (mins > 59 or mins < 1):       
        looper = 1
        mins = int(input("Invalid selection, please choose from 1-59: "))
    elif (mins >= 1 or mins <= 12):
            looper = 0
# User input and error checking of secs:  
secs = int(input("Enter current second: "))
looper = 1
while looper == 1:
    if (secs > 59 or secs < 1):       
        looper = 1
        secs = int(input("Invalid selection, please choose from 1-59: "))
    elif (secs >= 1 or secs <= 12):
            looper = 0
# User input and error checking of AM/PM:
timeOfDay = input("Enter AM or PM: ")
timeOfDay = timeOfDay.upper()
looper = 1
while looper == 1: 
    if (timeOfDay == 'AM' or timeOfDay == 'PM'):
        looper = 0
    elif (timeOfDay != 'AM' or timeOfDay != 'PM'):
        looper = 1
        timeOfDay = input("Invalid selection, please enter AM or PM or am or pm: ")
        timeOfDay = timeOfDay.upper()
# Calculate data from user input
if timeOfDay == 'AM' and hours != 12:
    total = (hours * 3600) + (mins * 60) + (secs)
elif timeOfDay == 'AM' and hours == 12:
    total = (mins * 60) + (secs)
if timeOfDay == 'PM' and hours != 12:
    total  = 43200 + ((hours * 3600) + (mins * 60) + (secs))
elif timeOfDay == 'PM' and hours == 12: 
    total = (hours * 3600) + (mins * 60) + (secs)
print("It has been" , total, "seconds since midnight!")
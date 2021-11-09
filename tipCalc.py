#member id number random generated acting like a server provided random number
#if the number does not == random number regenerate and prompt for number
#try to find some GUI support for this and possible web page integration?
repeat = 'Y'
while (repeat == 'Y'):
    entry = float(input("Enter bill total to see percentage chart..."))
    one = entry * .10
    two = entry * .20
    three = entry * .30
    invalid = 0
    while (invalid == 0):
            print("Total to tip 10%:", round((one + entry) , 2) , "\n" , "Total to tip 20%:", round((two + entry) , 2) , "\n" , "Total to tip 30%:" , round((three + entry), 2))
            choice = int(input("Enter 1 for 10%, 2 for 20% or 3 for 30%. Alternatively, select 0 for a custom tip percentage. "))
            if (choice == 1):
                print("Your total is: " , (entry * 1.10))
                invalid = 1
            elif (choice == 2):
                print("Your total is: " , (entry * 1.20))
                invalid = 1
            elif (choice == 3):
                print("Your total is: " , (entry * 1.30))
                invalid = 1
            elif (choice == 0):
                customEntry = int(input("Enter custom percentage..."))
                print("Your total is: " , ((entry * (round(customEntry , 2) / 100)) + entry))
                invalid = 1
            else:
                print("Invalid entry, please enter 1 , 2 , 3 or 0: ")
    repeat = str(input("Enter Y to start over or N to quit: "))
    repeat = repeat.upper()
print("Thank you, we hope you enjoyed your meal!")
    
    

while True:
    try:
        hotdogs = int(input("Enter amount of hotdogs:"))
        z = 1/hotdogs
    except ValueError:
        print("Must be an integer!")
    except ZeroDivisionError:
        print("Value cannot be 0!")
    else:
        break
while True:
    try:
        soda = int(input("Enter amount of soda:"))
        z = 1/soda
    except ValueError:
        print("Must be an integer!")
    except ZeroDivisionError:
        print("Value cannot be 0!")
    else:
        break
while True:
    try:
        chips = int(input("Enter amount of chips:"))
        z = 1/chips
    except ValueError:
        print("Must be an integer!")
    except ZeroDivisionError:
        print("Value cannot be 0!")
    else:
        break
total = (hotdogs * 2.5) + (soda * 1.25) + (chips * 1.50)
print("Your total is..." , total)

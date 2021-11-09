def main():
    userKwH = float(input("Enter kWh used: "))
    userClass = str(input("Enter 'R' for residential or B for business rate: "))
    userClass = userClass.upper()
    bill_calculator(userKwH , userClass)
def bill_calculator(x , y):
        if (y == 'R'):
            if (x <= 500):
                total = x * .12
                print("Your total is:" , total)
            elif (x > 500):
                total = (500 * .12) + ((x - 500) * .15)
                print("Your total is:", total)
        if (y == 'B'):
            if (x <= 800):
                total = x * .16
                print("Your total is:" , total)
            elif (x > 800):
                total = (800 * .16) + ((x - 800) * .20)
                print("Your total is:", total)
main()
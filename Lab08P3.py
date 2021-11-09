import currency
def main():
    userCurrencyInput = int(input("Enter 1 for Euro, 2 for Japanese Yen, 3 for Mexican Peso..."))
    while (userCurrencyInput != 1 and userCurrencyInput != 2 and userCurrencyInput != 3):
        userCurrencyInput = int(input("Invalid input, please enter 1, 2 or 3..."))
    valid = 0
    while (valid == 0):
        userInput = float(input("Enter US dollar amount..."))
        if (userInput < 0):
            print("Input is not valid, input a postive number please...")
        elif (userInput >= 0):
            userInput = userInput
            valid = 1
    if (userCurrencyInput == 1):
        total = currency.to_euro(userInput)
        print("Your" , userInput , "US Dollars equal" , total , "Euros")
    if (userCurrencyInput == 2):
        total = currency.to_yen(userInput)
        print("Your" , userInput , "US Dollars equal" , total , "Japanese Yen")
    if (userCurrencyInput == 3):
        total = currency.to_peso(userInput)
        print("Your" , userInput , "US Dollars equal" , total , "Mexican Pesos")
main()
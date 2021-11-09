import random
#user card distribution 
total = 0
cards = ("A","2","3","4","5","6","7","8","9","10","J","Q","K")
entryOne = random.choice(cards)
entryTwo = random.choice(cards)
value = entryOne
valueTwo = entryTwo
if entryOne == 'A':
    value = 11
elif entryTwo == 'A':
    valueTwo = 11
elif entryOne == 'J':
    value = 10
elif entryTwo == 'J':
    valueTwo = 10
elif entryOne == 'Q':
    value = 10
elif entryTwo == 'Q':
    valueTwo = 10
elif entryOne == 'K':
    value = 10
elif entryTwo == 'K':
    valueTwo = 10
results = int(value) + int(valueTwo)
print("Card drawn..." , entryOne , "Player total..." , value)
print("Card drawn..." , entryTwo , "Player total..." , results)
if results == 21:
    print("Blackjack, you win!")
elif results > 21:
    print("You busted!")
#user card prompt
drawCard = 'y'
while drawCard == 'y':
    drawCard = input("Enter y/n to draw another card...")
    if drawCard == 'y':
        entryThree = random.choice(cards)
        valueThree = entryThree
        if entryThree == 'A':
            valueThree = 11
        elif entryThree == 'J':
            valueThree = 10
        elif entryThree == 'Q':
            valueThree = 10
        elif entryThree == 'K':
            valueThree = 10
        results = results + int(valueThree)
        print(results)
        if results == 21:
            print("Blackjack, you win!")
            exit()
        elif results > 21:
            print("You busted! Dealer win!")
            exit()
    else:
        drawCard = 'n'

#Dealer card distribution and loop
entryOneDealer = random.choice(cards)
entryTwoDealer = random.choice(cards)
valueDealer = entryOneDealer
valueTwoDealer = entryTwoDealer
if entryOneDealer == 'A':
    valueDealer = 11
elif entryTwoDealer == 'A':
    valueTwoDealer = 11
elif entryOneDealer == 'J':
    valueDealer = 10
elif entryTwoDealer == 'J':
    valueTwoDealer = 10
elif entryOneDealer == 'Q':
    valueDealer = 10
elif entryTwoDealer == 'Q':
    valueTwoDealer = 10
elif entryOneDealer == 'K':
    valueDealer = 10
elif entryTwoDealer == 'K':
    valueTwoDealer = 10
resultsDealer = int(valueDealer) + int(valueTwoDealer)
print("Dealer card drawn..." , entryOneDealer , "Dealer total..." , valueDealer)
print("Dealer card drawn..." , entryTwoDealer , "Dealer total..." , resultsDealer)
if resultsDealer == 21:
    print("Blackjack, dealer win!")
elif resultsDealer > 21:
    print("Dealer busted!")

#Dealer if under 17 total, auto hit loop

while resultsDealer < 17:
    entryThreeDealer = random.choice(cards)
    valueThreeDealer = entryThreeDealer
    if entryThreeDealer == 'A':
        valueThreeDealer = 11
    elif entryThreeDealer == 'J':
        valueThreeDealer = 10
    elif entryThreeDealer == 'Q':
        valueThreeDealer = 10
    elif entryThreeDealer == 'K':
        valueThreeDealer = 10
    resultsDealer = resultsDealer + int(valueThreeDealer)
    print(resultsDealer)
    if resultsDealer == 21:
        print("Blackjack, dealer win!")
        exit()
    elif resultsDealer > 21:
        print("Dealer busted! You win!")
        exit()
if results > resultsDealer:
    print("User wins!")
else:
    print("Dealer win!")
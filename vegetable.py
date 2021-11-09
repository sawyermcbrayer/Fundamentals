def onion():
    veggieCount = int(input("How many Onions have you cut with this knife...?"))
    distance = veggieCount * (45 * 2)
    inFeet = distance / 12
    return distance , inFeet
def carrot():
    veggieCount = int(input("How many Carrots have you cut with this knife...?"))
    distance = veggieCount * (25 * .75)
    inFeet = distance / 12
    return distance , inFeet
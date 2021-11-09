def main():
    import random
    validator = False
    while (validator == False):
        userInput = []
        for i in range(4):
            entry = int(input("Enter your number between 1-10, no repeating numbers..."))
            userInput.append(entry)
        resultList = checkDuplicate(userInput)
        #print(resultList , "one")
        while (resultList == True):
            userInput = []
            print("Invalid entry no duplicates, please...start over...")
            for i in range(4):
                entry = int(input("Enter your number between 1-10, no repeating numbers..."))
                userInput.append(entry)
            resultList = checkDuplicate(userInput)
        userInput.sort()
        rangeCheck = rangeChecker(userInput)
        while (rangeCheck == False):
            userInput = []
            print("Invalid entries, no numbers below 1 or above 10...")
            for i in range(4):
                entry = int(input("Enter your number between 1-10, no repeating numbers..."))
                userInput.append(entry)
            rangeCheck = rangeChecker(userInput)
        validator = True
    print("Your list of numbers..." , userInput)
    randomBallList = random.sample(range(1,10) , 4)
    randomBallList.sort()
    print("Randomly drawn balls from container..." , randomBallList)
    matchCounter = 0
    for i in range(4):
        if (userInput[i] == randomBallList[i]):
            matchCounter = matchCounter + 1
    print(matchCounter)







def checkDuplicate(userList):
    result = any(userList.count(x) > 1 for x in userList)
    return result
def rangeChecker(userListTwo):
    rangeResult = True
    for i in range(4):
        if (userListTwo[i] > 10 or userListTwo[i] < 1):
            rangeResult = False
    return rangeResult
main()
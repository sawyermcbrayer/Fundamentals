d = {}
userInput = input("Enter a string! ")
j=0
while j < len(userInput):
    d[j] = userInput[j] 
    j = j + 1
print(d)
length = len(d)
print("Length of dictionary..." , length)
userKey = int(input("Enter a key to access dictionary item..."))
for j in range(length):
    if userKey == j:
        print(d[j] , "...is the retrieved value...")
    elif (userKey > length):
        print("Error, dictionary does not contain entered key index...")
        userKey = int(input("Enter a proper key to access dictionary item..."))
userValue = input("Enter a value to search for it in dictionary...")
counter = 0
for j in range(length):
    if userValue == d[j]:
        counter = counter  + 1
if counter > 0:
    print("Value found...")
else:
    print("Value not found...")
userCharacter = input("Enter a character to add to dictionary!")
d[len(d)] = userCharacter
print("User character added" , d)
d.popitem()
d[len(d)] = 'McBrayer'
print(d)
length = len(d)
userDelete = int(input("Enter a key to delete from dictionary..."))
nothing = 0
for j in range(length):
    if userDelete == j:
        del d[j]
        print(d , "Value removed")
        nothing = nothing + 1
if nothing == 0:
    print("No value found...")
userSplit = input("Enter a string of digits separated by commas....")
userSplitSeparated = userSplit.split(',')
userSplitLength = len(userSplitSeparated)
for items in range(userSplitLength):
    userSplitSeparated[items] = int(userSplitSeparated[items])
for j in range(userSplitLength):
    if userSplitSeparated[j] in d:
        print(d[j])
    if userSplitSeparated[j] > length or userSplitSeparated[j] < 0:
        d[j] = '*'
        print(d[j])





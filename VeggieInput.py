import vegetable
def main():
    print("This program will calculate aproximately how many inches your kitchen knife has cut through vegetables.")
    print("First, input the type of vegetable that you wish to have calculated.")
    print("Then we will ask you to input the approximate number of the specific vegetable that you have cut!")
    print("Finally, your kitchen knife veggie count!")
    userVeggieInput = int(input("Enter 1 for Onions or 2 for Carrots..."))
    while (userVeggieInput != 1 and userVeggieInput != 2):
        userVeggieInput = int(input("Invalid input, please enter 1 or 2..."))
    if (userVeggieInput == 1):
        onionReturn , conversion = vegetable.onion()
        print("You have cut through" , onionReturn , "inches of Onions! Wow!")
        print("Thats like cutting through a" , conversion , "foot tall onion....woah")
    elif (userVeggieInput == 2):
        carrotReturn , conversion = vegetable.carrot()
        print("Your have cut through" , carrotReturn , "inches of Carrots!")
        print("Thats like cutting through a" , conversion , "foot tall carrot.")

main()

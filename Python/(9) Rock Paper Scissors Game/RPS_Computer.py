# import random
from random import randint

print("...rock...")
print("...paper...")
print("...scissors...")

player = input("Player, make your move: ").lower()
rand_num = randint(0,2)

if rand_num == 0:
    computer = "rock"
elif rand_num == 1:
    computer = "paper"
elif rand_num == 2:
    computer = "scissors"

# print("Computer choice was: " + computer)
print(f"Compuer choice is {computer}")


if computer == player:
    print("Its a tie")

elif player == "rock":
    if computer == "scissors":
        print("player wins")
    else:
        print("computer wins")

elif player == "paper":
    if computer == "rock":
        print("player wins")
    else:
        print("computer wins")

elif player == "scissors":
    if computer == "paper":
        print("player wins")
    else:
        print("computer wins")

else:
    print("Incorrect answer")

# if player == "rock" and computer == "scissors":
#     print("player 1 wins")

# elif player == "paper" and computer == "rock":
#     print("player wins")

# elif player =="scissors" and computer == "paper":
#     print("player wins")

# elif computer == "rock" and player == "scissors":
#     print("computer wins")

# elif computer == "paper" and player == "rock":
#     print("computer wins")

# elif computer =="scissors" and player == "paper":
#     print("computer wins")

# elif player == computer:
#     print("It's a tie")

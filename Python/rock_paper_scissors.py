print("...rock...")
print("...paper...")
print("...scissors...")

player1 = input("Player 1, amke your move: ")
print("*** NO CHEATING ***\n" * 20)
player2 = input("Player 2, amke your move: ")

if player1 == "rock":
    if player2 == "scissors":
        print("player1 wins")
    elif player2 == "paper":
        print("player2 wins")
    elif player2 == player1:
        print("Its a tie")
    else:
        print("Incorrect answer")

elif player1 == "paper":
    if player2 == "rock":
        print("player1 wins")
    elif player2 == "scissors":
        print("player2 wins")
    elif player2 == player1:
        print("Its a tie")
    else:
        print("Incorrect answer")

elif player1 == "scissors":
    if player2 == "paper":
        print("player1 wins")
    elif player2 == "rock":
        print("player2 wins")
    elif player2 == player1:
        print("Its a tie")
    else:
        print("Incorrect answer")

else:
    print("Incorrect answer")

# if player1 == "rock" and player2 == "scissors":
#     print("player 1 wins")

# elif player1 == "paper" and player2 == "rock":
#     print("player1 wins")

# elif player1 =="scissors" and player2 == "paper":
#     print("player1 wins")

# elif player2 == "rock" and player1 == "scissors":
#     print("player2 wins")

# elif player2 == "paper" and player1 == "rock":
#     print("player2 wins")

# elif player2 =="scissors" and player1 == "paper":
#     print("player2 wins")

# elif player1 == player2:
#     print("It's a tie")

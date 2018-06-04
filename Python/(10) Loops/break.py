# while True:
#     command = input("Type 'exit' to exit: ")
#     if command == "exit":
#         break


# for x in range(1,101):
#     print(x)
#     if x == 3:
#         break

times = int(input("Hows many times do I have to tell you: "))
for x in range(times):
    print("Clean Up Your Room")
    if x >= 4:
        print("Do you even listen anymore?")
        break

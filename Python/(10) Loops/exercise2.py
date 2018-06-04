# Initial answer doesnt exit loop
copy = input("How's it going?: ")
stop = "stop copying me".upper()

while copy != stop:
    print(copy)
    copy = input().upper()

print("Fine")
print("For loop")
for x in range(1,11):
    print("\U0001f600" * x)

print("While loop")
times = 1
while times < 11:
    print("\U0001f600" * times)
    times += 1

print("Nested For loop")
# Prints pyramid 3 times
for x in range(3):
    for y in range(1,11):
        print("\U0001f600" * y)

# Done without string multiplication
print("For loop with a While loop")
for x in range(1,11):
    count = 1
    smileys = ""
    while count < x:
        smileys += "\U0001f600"
        count += 1

    print(smileys)
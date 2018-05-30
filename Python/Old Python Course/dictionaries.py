phonebook = {}
phonebook["John"] = 2727272727
phonebook["Jill"] = 7272727272
phonebook["Hank"] = 8282828282

print(phonebook)

phonebook = {
        "John" : 21212121212,
        "Jill" : 65656565656,
        "Hank" : 64564646464
}
print(phonebook)

for name, number in phonebook.items():
    print("Phone number of %s is %d" % (name, number))

# these do the same thing
#del phonebook["John"]
#print(phonebook)
#
#phonebook.pop("Jill")
#print(phonebook)

phonebook["Jake"] = 938273443
del phonebook["Jill"]

# testing code
if "Jake" in phonebook:
    print("Jake is listed in the phonebook.")
if "Jill" not in phonebook:
    print("Jill is not listed in the phonebook.")

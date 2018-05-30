class myClass:
    variable = "classes"

    def func(self):
        print("This is from inside the class")

myobjectx = myClass()
myobjecty = myClass()

myobjecty.variable = "y object"

print(myobjectx.variable)
print(myobjecty.variable)

print(myobjectx.func())

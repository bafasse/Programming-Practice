# user defined function
def func(name = "Tom", msg = "hello"):
    print(name + " says " + msg);

def fname(name, msg):
    print(name + " says " + msg);

# *varargs is useful when you dont know the exact number of arguements
def varlengthArgs(*varargs):
    print(varargs)

def add(x, y):
    return x + y


varlengthArgs(30,40,50, 60)
func()
fname("Tom", "Hello World")

# this is how to force values to integers
x = int(input("Enter number 1: "))
y = int(input("Enter number 2: "))
z = 2 * add(x, y)
print(z)

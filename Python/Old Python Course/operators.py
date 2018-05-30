numbers = (1 + 2) * (3 + 4);
print("(1 + 2) * (3 + 4) = %d" % numbers);

# remainder
print("\nremainders");
remainder = 11 % 3;
print("11 (remainder) 3 = %d" % remainder);
remainder = 12 % 6;
print("12 (remainder) 6 = %s" % remainder);

# x^n
print("\npowers")
squared = 2 ** 2;
cubed = 7 ** 3;

print("2^2 = %d" % squared);
print("7^3 = %d" % cubed);

# String Operators
print("\nString Operators")
helloworld = "hello" + " " + "world";
print(helloworld);

lotsofhello = "hello " * 10
print(lotsofhello)

# operators with lists
print("\nlist operators")
even_numbers = [2,4,6,8]
odd_numbers = [1,3,5,7]

all_numbers = even_numbers + odd_numbers
print(all_numbers) # prints them but not in order

print([1,2,3] * 3)

x = object()
y = object()

x_list = [x] * 10
y_list = [y] * 10
big_list = x_list + y_list

print("x_list contains %d objects" % len(x_list))
print("y_list contains %d objects" % len(y_list))
print("big_list contains %d objects" % len(big_list))

# testing code
if x_list.count(x) == 10 and y_list.count(y) == 10:
    print("Almost there...")
if big_list.count(x) == 10 and big_list.count(y) == 10:
    print("Great!")

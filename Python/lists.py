mylist = [];
mylist.append(1);
mylist.append(2);
mylist.append(3);
print(mylist[0]);
print(mylist[1]);
print(mylist[2]);

print("For Loop");
for x in mylist:
    print(x);

# wont work, index is out of range
#mylist = [1, 2, 3];
#print(mylist[10]);

numbers = [];
strings = [];
names = ["Hanks", "Bobby", "Peggy"];

numbers.append(1);
numbers.append(2);
numbers.append(3);

strings.append("hello");
strings.append("world");

second_name = names[1];

print(names);
print(strings);
print("The second name of the names array is %s" % second_name);

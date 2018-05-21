puts "Enter your first name"
firstName = gets.chomp

puts "Enter your last name"
lastName = gets.chomp

puts "Welcome to the analyzer program, #{firstName} #{lastName}"
puts "Your first name has #{firstName.length} characters"
puts "Your last name has #{lastName.length} characters"

fullName = firstName + " " + lastName
puts "Your name in reverse is #{fullName.reverse}"

#finding the maximum number inside the list
data = [5,10,7,130]

finding_the_largest = 0 # using the var to index

for num in data: # my loop to iterate

    if num > finding_the_largest: # condition to compare numbers
        finding_the_largest = num #then a placeholder to store the largest number that we have find

print(finding_the_largest) # then we print the the largest number we have find 
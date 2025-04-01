# calculatues the sum of all the even numbers in the fibonacci sequence from 0, to 4000000
a, b = 0, 1
sum_even = 0
while b < 4000000:
    sum_even += b
    a, b = b, a+b

print(sum_even)

# answer should be 4613732

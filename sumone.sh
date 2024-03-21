echo "enter the number"
read number
sum=0
originalnum=number
while [ $number -gt 0 ]; do
	remainder=$((number%10))
	sum=$((sum+remainder))
	number=$((number/10))
done
echo "the sum is $sum"

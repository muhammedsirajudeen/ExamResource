echo "enter the number"
read number
reverse=0

while [ $number -gt 0 ]; do
	remainder=$((number%10))
	reverse=$((remainder+reverse*10))
	number=$((number/10))
done
echo "the reverse is $reverse"

echo "enter the number"
read number

factorial=1
while [ $number -gt 0 ]; do
	factorial=$((factorial*number))
	number=$((number-1))
done

echo $factorial

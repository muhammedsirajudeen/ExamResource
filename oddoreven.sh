echo "enter the number to be calculated"
read number
if [ $((number%2)) -eq 0 ]; then
	echo "the given number is even"
else
	echo "the given number is odd"
fi


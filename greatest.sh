echo "enter the first number"
read first
echo "enter the second number"
read second
echo "enter the third number"
read third

if [ $first -gt $second ] && [ $first -gt $third ]; then
	echo "$first is the greatest"
elif [ $second -gt $first ] && [ $second -gt $third ]; then
	echo "$second is the greatest"
else
	echo "$third is the greatest"
fi

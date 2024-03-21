echo "enter the limit"
read limit
fib=0
fib1=0
fib2=1
echo $fib1
echo $fib2
for (( i=0 ; i<=limit ; i++)); do
	fib=$((fib1+fib2))
	echo $fib
	fib1=$fib2
	fib2=$fib
done

		

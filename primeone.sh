echo "enter the limit"
read limit

for (( i=2 ; i < limit ; i++ )); do
	flag=0
	div=$((i-1))
	while [ $div -gt 1 ]; do
		if [ $((i%div)) -eq 0 ]; then
			flag=1
			break
		fi
		div=$((div-1))
	done

	if [ $flag -eq 0 ]; then
		echo "$i is a prime number"
	fi
done

echo "enter the radius of the circle"
read radius
area=$(echo "3.14159*$radius*$radius"| bc -l);
echo "the radius is$area"

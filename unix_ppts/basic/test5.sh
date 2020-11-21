#store values and display result

a=0

b=0

echo "Enter first value "

read a

echo "Enter other value "

read b

val=`expr $a + $b`

echo "a + b : $val"


val=`expr $a - $b`

echo "a - b : $val"


val=`expr $a \* $b`

echo "a * b : $val"


val=`expr $b / $a`

echo "b / a : $val"



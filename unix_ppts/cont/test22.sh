# example using exit  keyword

a=0

while [ $a -lt 10 ]
do
   echo $a
   if [ $a -eq 5 ]
   then
     exit
   fi
   a=`expr $a + 1`
done
echo "End of program"

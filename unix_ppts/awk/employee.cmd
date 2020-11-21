awk '{print;}' employee.txt

awk '/Thomas/
 /Nisha/' employee.txt


awk '{print $2,$5;}' employee.txt


awk '{print $2,$NF;}' employee.txt



------

awk 'BEGIN {print "Name\tDesignation\tDepartment\tSalary";}

 {print $2,"\t",$3,"\t",$4,"\t",$NF;}
 
END
{print "Report Generated\n--------------";
 }' employee.txt



------

awk '$1 >200' employee.txt


------- employees in technology department


awk '$4 ~/Technology/' employee.txt



-----------------  number of employees in department



awk 'BEGIN { count=0;}
$4 ~ /Technology/ { count++; }

END { print "Number of employees in Technology Dept =",count;}' employee.txt



----------------  NR example



echo '1
 2
 3
 4' | awk 'NR == 2 { NR = 17 }
 { print NR }'


--------------- udf call


echo "Don't Panic!" |
 awk --source "BEGIN{ print (rev $0, length($0)) }" -f rev.awk



-------------



 awk '{Ip[$3]++;
 }

END{

for (var in Ip)
print var, "access", Ip[var]," times"
}
' employee.txt

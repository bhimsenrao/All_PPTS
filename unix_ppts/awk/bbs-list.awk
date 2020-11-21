awk "/foo/ { print $1 }" BBS-list
Print the length of the longest input line:
awk ’{ if (length($0) > max) max = length($0) }
END { print max }’ bbs-list

Print every line that is longer than 80 characters:
awk ’length($1) > 50’ bbs-list

Using printf:

awk '{ printf "%-10s %s\n", $1, $2 }' bbc-list

awk 'BEGIN { print "Name      Number"
             print "----      ------" }
     { printf "%-10s %s\n", $1, $2 }' bbc-list


Output redirection:
awk '{ print $2 > "phone-list"
   print $1 > "name-list" }' bbc-list
$ cat phone-list

getline usage

{
if ((getline tmp) > 0) {
print tmp
print $0
} else
print $0
}

--------------
BEGIN {
"date" | getline current_time
close("date")
print "Report printed on " current_time
}

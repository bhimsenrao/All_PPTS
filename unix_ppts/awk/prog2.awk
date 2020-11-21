BEGIN 	{ print "File\tOwner" }
		{ print $8, "\t", $3}
END   	{ print " - DONE -" }
# execute program using command as awk -f thisfilename.awk

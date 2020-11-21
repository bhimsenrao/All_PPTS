function maxelt(vec,   i, ret)
{
   print "Function called";
     for (i in vec) {
          if (ret == "" || vec[i] > ret){
               ret = vec[i];
           
           }
     }
     return ret
}

# Load all fields of each record into nums.
BEGIN{
   print "Stated";
     for(i = 0; i <= NF; i++){
          nums[i] =i;
      print nums[i];
     }
}

END {
     print maxelt(nums);
}


/*Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them. */

public int countHi2(String str) {
  if(str.length() < 3)
  {
   if(str.equals("hi"))
    return 1;
   return 0;
  }
   
  if(str.substring(0,3).equals("xhi"))
   return countHi2(str.substring(2,str.length()));
  else if(str.substring(0,2).equals("hi"))
   return 1 + countHi2(str.substring(1,str.length()));
  return countHi2(str.substring(1,str.length()));
}


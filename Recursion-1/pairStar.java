/*Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*". */

public String pairStar(String str) {
  if(str.length() < 2)
   return str;
  
  if(str.charAt(0) == str.charAt(1))
   return str.substring(0,1) + "*" + pairStar(str.substring(1, str.length()));
  else
   return str.substring(0,1) + pairStar(str.substring(1,str.length()));
   
}


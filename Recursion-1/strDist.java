/*Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length. */

public int strDist(String str, String sub) {
  if(str.length() < sub.length())
   return 0;
  else if((str.substring(0, sub.length()).equals(sub) && str.substring(str.length() - sub.length(), str.length()).equals(sub)))
   return str.length();
   
  if(str.substring(0,sub.length()).equals(sub))
   return strDist(str.substring(0, str.length() - 1),sub);
  else
   return strDist(str.substring(1,str.length()), sub);
}


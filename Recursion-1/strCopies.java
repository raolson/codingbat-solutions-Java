/*Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping. N will be non-negative. */

public boolean strCopies(String str, String sub, int n) {
   if(str.length() < sub.length())
   {
    if(n <= 0)
     return true;
    else
     return false;
   }
   
  if(str.substring(0, sub.length()).equals(sub))
   return strCopies(str.substring(1,str.length()), sub, n-1);
  else
   return strCopies(str.substring(1,str.length()), sub, n);
}


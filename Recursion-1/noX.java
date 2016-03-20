/*Given a string, compute recursively a new string where all the 'x' chars have been removed. */

public String noX(String str) {
  if(!str.matches(".*x.*"))
   return str;
  if(str.charAt(0) == 'x')
   return noX(str.substring(1, str.length()));
  else
   return str.charAt(0) + noX(str.substring(1, str.length()));
}


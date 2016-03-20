/*Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars. */

public String changeXY(String str) {
  if(!str.contains("x"))
   return str;
  
  if(str.charAt(0) == 'x')
   return "y" + changeXY(str.substring(1,str.length()));
  else
   return str.substring(0,1) + changeXY(str.substring(1,str.length()));
}


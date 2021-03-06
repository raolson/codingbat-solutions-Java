/*Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".*/

public String changePi(String str) {
  if(!str.contains("pi"))
   return str;
   
   
  if(str.substring(0,2).equals("pi"))
   return "3.14" + changePi(str.substring(2,str.length()));
  else
   return str.substring(0,1) + changePi(str.substring(1,str.length()));
}


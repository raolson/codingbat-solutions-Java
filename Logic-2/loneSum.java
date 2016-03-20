/*Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum. */

public int loneSum(int a, int b, int c) {
  return a==b && b==c ? 0 : a==b ? c : b==c ? a : a==c ? b : a+b+c;
  
}


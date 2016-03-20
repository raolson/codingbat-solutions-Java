/*Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over. */

public int blackjack(int a, int b) {
  return a > 21 && b > 21 ? 0 : a > b && a <= 21 ? a : b <= 21 ? b : a;
  }


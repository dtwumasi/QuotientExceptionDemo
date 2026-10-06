public class QuotientExceptionDemo
{
public static void quotient(int num, int den)
{
  int answer = num / den;
  System.out.println(num + " / " + den + " = " + answer);
}

public static void main(String[] args) {
  try {
    quotient(10, 2);
    quotient(10, 0);
  } catch (ArithmeticException e) {
    System.out.println("Error: " + e.getMessage());
  }
}
}

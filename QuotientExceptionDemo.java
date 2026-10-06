import java.util.InputMismatchException;
import java.util.Scanner;

public class QuotientExceptionDemo
{
public static void quotient(int num, int den)
{
  int answer = num / den;
  System.out.println(num + " / " + den + " = " + answer);
}

public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  try {
    System.out.print("Enter the numerator: ");
    int num = input.nextInt();
    System.out.print("Enter the denominator: ");
    int den = input.nextInt();
    quotient(num, den);
  } catch (ArithmeticException e) {
    System.out.println("Error: " + e.getMessage());
  } catch (InputMismatchException e) {
    System.out.println("Error: please enter whole numbers only");
  }
  input.close();
}
}

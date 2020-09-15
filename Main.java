import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //variables
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number to count down or up from, then press enter: ");
    int num = s.nextInt();

    //positive # loop
    while (num > 0) {
      num -= 1;
      System.out.println(num);
    }

    //Negative # loop
    while (num < 0) {
      num++;
      System.out.println(num);
    }


    System.out.println("Blast off!");
  }
}
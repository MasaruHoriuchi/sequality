/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    int sum = 0, sumodd = 0, sumeven = 0;
    System.out.println(new App().getGreeting());
    Calculate cal = new Calculate();
    System.out.println("Sum of 2 and 3 is " + cal.sum(2, 3) + ".Average is " + (float) cal.sum(2, 3) / 2 + ".");
    for (int i = 1; i <= 10; i++) {
      sum = cal.sum(sum, i);
    }
    System.out.println("Sum of 1 to 10 is " + sum + ".Average is " + (float) sum / 10 + ".");
    for (int i = 1; i <= 10; i++) {
      if (i % 2 != 0) {
        sumodd = cal.sum(sumodd, i);
      } else {
        sumeven = cal.sum(sumeven, i);
      }
    }
    System.out.println("Sum of odd of 1 to 10 is " + sumodd + ".Sum of even is " + sumeven + ".");
  }
}

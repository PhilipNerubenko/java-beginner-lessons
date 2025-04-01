package lesson15;

public class CycleWhileAndDoWhile {
  public static void main(String[] args) {
    // int i = 1;
    // while (i <= 10) {
    //     System.out.println(i);
    //     i++;
    // }
    // System.out.println("Without loop: " + i);
    boolean flag = true;
    int a = 1;

    while (flag) {
      System.out.println(a);
      if (a % 3 == 0 && a % 7 == 0) {
        flag = false;
      }
      a++;
    }

    System.out.println();

    int z = 5; // 6, 7, 8, 9, 10, 11, 12
    while (z++ < 10) {
      z++;
    }

    System.out.println(z + "\n");

    // int y = 1;
    // while (y < 10); // endless loop
    int j = 1;
    do {
      System.out.println(j);
      j++;
    } while (j <= 10);

    System.out.println();

    int hour = 0;
  // OUTER - метка, INNER - метка
  OUTER:
    do {
      int min = 0;
    INNER:
      while (min < 60) {
        // if (min == 20) {
        //     continue OUTER; // continue - moves to the next iteration of the outer loop, works
        //     against OUTER loop
        // }
        System.out.println(hour + ":" + min);
        min++;
      }
      hour++;
    } while (hour < 24);

    System.out.println();

    // label OUTER, INNER - метки
  OUTER:
    for (int i = 0; i < 24; i++) {
      int min = 0;
    INNER:
      while (min < 60) {
        System.out.println(i + ":" + min);
        min++;
      }
    }
  }
}

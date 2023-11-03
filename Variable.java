public class Variable {

  public static void main(String[] args) {
    hw1();
  }

  private static void first() {
    byte d = 23; // 1 byte
    short s = 23; // 2 byte
    int a = 1; // 4 byte
    long negative = -123421; // 8 byte

    float b = 2.3f;
    double c = 3.3;

    char x = ';';

    boolean t = true; // logic
  }

  // перменная -> сумка, контейнер, хранилище
  // тип данных ->
  // присвоение

  private static void naming() {
    // type name;
    // type name = value;

    byte x;
    int aaaaa; // объявил переменную

    // latin, english alphabet, digits, _

    int adjaskdfksd = 234;
    int _a_ss_d_____ = 2;
    int as_sdk23 = 23;
    int HALOasdf_sdlfkjlskjf1234 = 2;

    char star = '*';

    x = 12;

    double d112341234124 = 2.3;

    System.out.println(x);
    System.out.println(HALOasdf_sdlfkjlskjf1234);
    System.out.println(_a_ss_d_____);
    System.out.println(d112341234124);
  }

  private static void assign() {
    // assignment  ---> =  ----> присвоение
    // type name;
    // type name = value;
    int a = 1, b = 3;

    int P = 2 * (a + b);
    int S = a * b;

    System.out.println(P);
    System.out.println(S);



    int x = 2;
    S = 3 * a * b + x;
    System.out.println(S);
  }

  private static void stringType() {
    // строки, текст это набор строк
    // строка это набор символов
    char c = 's';
    String str = "Hello my name is Санжар. Мне 28 лет. And work as a software engineer. I earn 290 000$ per year.";
    System.out.println(  str + " Hello guys! ---> " + c  );
  }

  private static void stringSecondWave() {
    String one = "one";
    one += " " + "two" + " ";
    one = one + "three";
    System.out.println(one);

    one = one + " four"; // a = a + 4; -> a += 4;
    System.out.println(one);
    one += " five";
    System.out.println(one);
    // sout
  }

  private static void stringUntil101() {
    String count = "";
    for (int i = 1; i < 101; ++i) {
      count += i + " ";
    }
    System.out.println(count);
  }

  private static void arithmeticOperators() {
    int a = 34;
    int b = 20;
    int sum = a + b;
    int mul = a * b;
    int subs = a - b;
    int div = a / b;
    int mod = a % b;
    System.out.print("sum: " + sum);
    System.out.println();
    System.out.print("mul: " + mul);
    System.out.println();
    System.out.print("subs: " + subs);
    System.out.println();
    System.out.print("div: " + div);
    System.out.println();
    System.out.print("mod: " + mod);
    System.out.println();
    System.out.println(a / b * 1.0);
  }

  private static void arithmeticOperatorsDouble() {

    int a = 34;
    int b = 20;
    int sum = a + b;
    int mul = a * b;
    int subs = a - b;
    int div = a / b;
    int mod = a % b;

    System.out.print("sum: " + sum);
    System.out.println();
    System.out.print("mul: " + mul);
    System.out.println();
    System.out.print("subs: " + subs);
    System.out.println();
    System.out.print("div: " + div);
    System.out.println();
    System.out.print("mod: " + mod);
  }


  private static void modulo() {
    int a = 3;
    int b = 7;
    int c = 5;

    int mod1 = a % b;
    int mod2 = c % b;

    int mod3 = b % a;

    int mod4 = c % a;
    // 7 / 5 -> int 1 -> 7 - 5 = 2
    int mod5 = b % c;

    System.out.println("mod1: " + mod1);
    System.out.println("mod2: " + mod2);

    System.out.println("mod3: " + mod3);

    System.out.println("mod4: " + mod4);
    System.out.println("mod5: " + mod5);

    System.out.println("mod6: " + 9 % 2); // 9 / 2 -> 4 -> 9 - 4 * 2 = 1
    System.out.println("mod6: " + 9 % 3); // 9 / 3 -> 3 -> 9 - 3 * 3 = 0
  }

  private static void lineBreak() {
    int a = 5;
    int b = 3;
    double c = 2.3;
    float d = 1.7f;
    double a1 = a + b * c + (d + c);
    float x = d + b;

    float a2 = (float) (a + b * c + (d + c) + d);

    long l = 1897123984723l;
    double pi = 3.14;
    double sum = pi + l;
    System.out.println(a1);
  }

  private static void hw1() {
    String name = "Sanzhar Suleimenov";
    System.out.println("Hello");
    System.out.println(name);
  }

  private static void hw2() {
    // ...
  }

}
public class SqrRoot {

  public static void main(String[] args) {
    double i, sroot, rerr;

    for (i = 1.0; i < 100.0; i++) {
      sroot = Math.sqrt(i);
      System.out.println("Square root of " + i + "is " + sroot + ".");

      rerr = i - (sroot * sroot);
      System.out.println("Rounding error is " + rerr + ".");
      System.out.println();
    }
  }
}


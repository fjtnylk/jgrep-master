package org.jgrep;

/**
 * Created by yanglikai on 2019/3/1.
 */
public class Main {
  private static final String VERSION = "1.0.0";

  public static void main(String[] args) {
    if (0 == args.length) {
      printGenericCommandUsage();
      System.exit(1);
    }

    for (String arg : args) {
      if ("-version".equals(arg)) {
        System.out.println(VERSION);
        System.exit(1);
      }
    }
  }

  private static void printGenericCommandUsage() {
    System.out.println("Generic options supported are:");
    System.out.println("-version <show version>        "
        + "application show version");
    System.out.println("-input <input file>        "
        + "input file");
  }
}

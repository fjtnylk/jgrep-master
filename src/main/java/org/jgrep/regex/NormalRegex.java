package org.jgrep.regex;

/**
 * Created by yanglikai on 2019/3/01.
 */
public class NormalRegex implements Regex {

  private String regex;

  public NormalRegex() {
    this.regex = "^\\[\\w%s+\\w$";
  }

  public NormalRegex(String regex) {
    this.regex = regex;
  }

  @Override
  public String getTraget() {
    return regex;
  }
}

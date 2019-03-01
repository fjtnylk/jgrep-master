package org.jgrep.grep;

/**
 * Created by yanglikai on 2019/3/01.
 */
public final class GrepFactory {

  public static Grep build() {
    return new GeneralGrep();
  }
}

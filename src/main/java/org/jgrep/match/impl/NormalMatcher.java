package org.jgrep.match.impl;


import org.jgrep.match.Matcher;

/**
 * Created by yanglikai on 2019/3/01.
 */
public class NormalMatcher implements Matcher {

  @Override
  public boolean match(String kw, String content) {
    int index = content.indexOf(kw);

    return index > 0;
  }
}

package org.jgrep.match.impl;

import java.util.regex.Pattern;
import org.jgrep.match.Matcher;
import org.jgrep.regex.NormalRegex;
import org.jgrep.regex.Regex;

/**
 * Created by yanglikai on 2019/3/01.
 */
public class RegexMatcher implements Matcher {

  @Override
  public boolean match(String kw, String content) {
    Regex regex = new NormalRegex();

    Pattern pattern = Pattern.compile(String.format(regex.getTraget(), kw));

    java.util.regex.Matcher matcher = pattern.matcher(content);

    return matcher.matches();
  }
}

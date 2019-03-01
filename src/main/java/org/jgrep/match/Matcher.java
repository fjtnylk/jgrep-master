package org.jgrep.match;

/**
 * Created by yanglikai on 2019/3/01.
 */
public interface Matcher {

  boolean match(String kw, String content);
}

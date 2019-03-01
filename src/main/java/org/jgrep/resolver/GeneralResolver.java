package org.jgrep.resolver;

import java.io.UnsupportedEncodingException;

/**
 * Created by yanglikai on 2019/3/1.
 */
public class GeneralResolver implements Resolver {

  @Override
  public String resolve(String target) {
    try {
      return new String(target.getBytes(), "UTF-8");
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }

    return "";
  }
}

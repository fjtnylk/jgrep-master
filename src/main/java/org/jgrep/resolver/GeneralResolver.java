package org.jgrep.resolver;

/**
 * Created by yanglikai on 2019/3/1.
 */
public class GeneralResolver implements Resolver {

  @Override
  public String resolve(String target) {
    return target;
  }
}

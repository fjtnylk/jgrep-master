package org.jgrep.resolver;

/**
 * Created by yanglikai on 2019/3/1.
 */
public class LogResolver implements Resolver {

  @Override
  public String resolve(String target) {
    String[] splits = target.split("\\^_\\^");
    String request = splits.length > splits.length - 2 ? splits[splits.length - 2] : "";

    splits = request.split("->>");
    String output = splits.length > splits.length - 1 ? splits[splits.length - 1] : "";

    return output;
  }
}

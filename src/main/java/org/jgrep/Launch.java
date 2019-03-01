package org.jgrep;

import org.apache.commons.lang3.StringUtils;
import org.jgrep.channel.Channel;
import org.jgrep.grep.Grep;
import org.jgrep.grep.GrepFactory;

/**
 * Created by yanglikai on 2019/3/1.
 */
public class Launch {

  public static void main(String[] args) {
    if (0 == args.length) {
      System.out.println("parameter is must not null");
      System.exit(1);
    }

    String kw = args.length > 0 ? args[0] : "";
    if (StringUtils.isEmpty(kw)) {
      System.out.println("kw is must not null");
      System.exit(1);
    }

    String path = args.length > 1 ? args[1] : "";
    if (StringUtils.isEmpty(path)) {
      System.out.println("path is must not null");
      System.exit(1);
    }

    Grep grep = GrepFactory.build();
    Channel channel = grep.grep(kw, path);

    for (int i = 2; i < args.length; i++) {
      channel.grep(args[i]);
    }

    System.out.println(channel.getResult().tString());
  }
}

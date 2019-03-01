package org.jgrep.channel;


import org.jgrep.grep.Grep;
import org.jgrep.result.Result;

/**
 * Created by yanglikai on 2019/3/01.
 */
public class GeneralChannel implements Channel {

  private Grep grep;

  public GeneralChannel(Grep grep) {
    this.grep = grep;
  }

  @Override
  public Channel grep(String kw) {
    return grep.grep(kw);
  }

  @Override
  public Result getResult() {
    return grep.getResult();
  }
}

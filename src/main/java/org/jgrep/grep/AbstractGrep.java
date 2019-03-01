package org.jgrep.grep;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import org.apache.commons.io.FileUtils;
import org.jgrep.channel.Channel;
import org.jgrep.channel.GeneralChannel;
import org.jgrep.match.Matcher;
import org.jgrep.match.impl.NormalMatcher;
import org.jgrep.result.GeneralResult;
import org.jgrep.result.Result;

/**
 * Created by yanglikai on 2019/3/01.
 */
public abstract class AbstractGrep implements Grep {

  private Matcher matcher;

  private Queue<String> queue;

  private Channel channel;

  public AbstractGrep() {
    this.matcher = new NormalMatcher();
    this.queue = new ArrayDeque<>();
    this.channel = new GeneralChannel(this);
  }

  @Override
  public Channel grep(String kw, String path) {
    File file = new File(path);

    return grep(kw, file);
  }

  private Channel grep(String kw, File file) {
    try {
      List<String> values = FileUtils.readLines(file);

      values.forEach(value -> {
        boolean isMatch = matcher.match(kw, value);
        if (isMatch) {
          queue.add(value);
        }
      });
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return channel;
  }

  @Override
  public Channel grep(String kw) {
    for (String value : queue) {
      boolean isMatch = matcher.match(kw, value);
      if (isMatch == false) {
        queue.remove(value);
      }
    }

    return channel;
  }

  @Override
  public Result getResult() {
    return new GeneralResult(String.join(System.lineSeparator(), queue));
  }
}

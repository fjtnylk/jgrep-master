package org.jgrep.grep;


import org.jgrep.channel.Channel;
import org.jgrep.result.Result;

/**
 * Created by yanglikai on 2019/3/01.
 */
public interface Grep {

  Channel grep(String kw, String path);

  Channel grep(String kw);

  Result getResult();
}

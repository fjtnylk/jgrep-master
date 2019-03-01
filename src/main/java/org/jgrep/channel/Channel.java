package org.jgrep.channel;

import org.jgrep.result.Result;

/**
 * Created by yanglikai on 2019/3/01.
 */
public interface Channel {

  Channel grep(String kw);

  Result getResult();
}

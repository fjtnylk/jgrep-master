package org.jgrep;

import org.jgrep.grep.GrepFactory;
import org.junit.Test;

/**
 * Created by yanglikai on 2019/3/1.
 */
public class MainTest {

  @Test
  public void test01() {
    String kw1 = "RPS112";
    String kw2 = "0300326696";
    String path = "src/test/resources/datacollect.20190227.log";

    /* 单次grep */
    String result =
        GrepFactory.build()
            .grep(kw2, path)
            .getResult().tString();

    /* 多次grep */
    //String result =
    //    GrepFactory.build()
    //        .grep(kw1, path)
    //        .grep(kw2)
    //        .getResult().tString();

    System.out.println(result);
  }
}

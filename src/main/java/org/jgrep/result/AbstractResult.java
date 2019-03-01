package org.jgrep.result;


import org.apache.commons.lang3.StringUtils;
import org.jgrep.resolver.GeneralResolver;
import org.jgrep.resolver.Resolver;

/**
 * Created by yanglikai on 2019/3/1.
 */
public abstract class AbstractResult implements Result {

  private Resolver resolver;

  private String target;

  public AbstractResult(String target) {
    this(new GeneralResolver(), target);
  }

  public AbstractResult(Resolver resolver, String target) {
    this.resolver = resolver;
    this.target = target;
  }

  @Override
  public String tString() {
    if (StringUtils.isNotBlank(target)) {
      return resolver.resolve(target);
    }

    return "";
  }
}

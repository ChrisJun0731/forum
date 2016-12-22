package com.zj.forum.domain;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Created by zhujun on 2016/11/27.
 */
public class BaseDomain implements Serializable {
    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }
}

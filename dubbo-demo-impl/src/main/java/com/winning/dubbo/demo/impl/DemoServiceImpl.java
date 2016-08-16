package com.winning.dubbo.demo.impl;

import com.alibaba.dubbo.rpc.RpcContext;
import com.winning.dubbo.demo.api.DemoService;

/**
 * Created by Administrator on 2016/4/27.
 */
public class DemoServiceImpl implements DemoService {
    public String hello(String text) {
        return "hello world[" + RpcContext.getContext().getRemoteAddressString() + "]," + text;
    }
}

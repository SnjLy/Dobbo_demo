package com.yehao.code.business.service.impl;


import com.yehao.code.business.service.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Package: com.yehao.code.business.servce.impl
 * @Description:
 * @function:
 * @Author : LiuYong
 * Created by yehao on 2018/9/29.
 */
public class DemoServiceImpl implements DemoService{

    /**
     * 获取返回list
     *
     * @param id 主键ID
     * @return
     */
    @Override
    public List<String> getStrList(Long id) {
        List<String> list = new ArrayList();
        list.add(id.toString());
        list.add(this.getClass().getSimpleName());
        return list;
    }
}

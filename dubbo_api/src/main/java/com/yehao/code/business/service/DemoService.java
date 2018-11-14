package com.yehao.code.business.service;

import java.util.List;

/**
 * @Package: com.yehao.code.business.service
 * @Description:
 * @function:
 * @Author : LiuYong
 * Created by yehao on 2018/9/29.
 */
public interface DemoService {

    /**
     * 获取返回list
     * @param id 主键ID
     * @return
     */
    List<String> getStrList(Long id);
}

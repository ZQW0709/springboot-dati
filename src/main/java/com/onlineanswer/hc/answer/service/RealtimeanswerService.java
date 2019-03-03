package com.onlineanswer.hc.answer.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.onlineanswer.hc.answer.entity.Realtimeanswer;
import com.baomidou.mybatisplus.service.IService;
import com.onlineanswer.hc.utils.PageUtils;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zqw
 * @since 2019-03-02
 */
public interface RealtimeanswerService extends IService<Realtimeanswer> {

    PageUtils getCampusmanageList(Map<String, Object> params);

}

package com.onlineanswer.hc.answer.service.imp;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.onlineanswer.hc.answer.entity.Realtimeanswer;
import com.onlineanswer.hc.answer.dao.RealtimeanswerMapper;
import com.onlineanswer.hc.answer.service.RealtimeanswerService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.onlineanswer.hc.utils.PageUtils;
import com.onlineanswer.hc.utils.Query;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zqw
 * @since 2019-03-02
 */
@Service
public class RealtimeanswerServiceImpl extends ServiceImpl<RealtimeanswerMapper, Realtimeanswer> implements RealtimeanswerService {


    @Override
    public PageUtils getCampusmanageList(Map<String, Object> params) {
//        String name = "";
//        try {
//            name = params.get("name").toString();
//        } catch (Exception ex) {
//            name = "";
//        }
        Page<Realtimeanswer> page = this.selectPage(
                new Query<Realtimeanswer>(params).getPage()
//                new EntityWrapper<Realtimeanswer>().like("name", name)
        );
        return new PageUtils(page);
    }
}

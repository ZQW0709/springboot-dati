package com.onlineanswer.hc.answer.controller;


import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.onlineanswer.hc.answer.dao.RealtimeanswerMapper;
import com.onlineanswer.hc.answer.entity.Realtimeanswer;
import com.onlineanswer.hc.answer.service.RealtimeanswerService;
import com.onlineanswer.hc.answer.service.imp.RealtimeanswerServiceImpl;
import com.onlineanswer.hc.utils.PageUtils;
import com.onlineanswer.hc.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zqw
 * @since 2019-03-02
 */

@RestController
@CrossOrigin
public class RealtimeanswerAction  {

    @Autowired
    RealtimeanswerService realtimeanswerService;

    /*@Autowired
    private RealtimeanswerMapper realtimeanswerMapper;*/



    //添加
    @PostMapping("/addRealtimeanswer")
    public String addStudentsanswer(Realtimeanswer realtimeanswer, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        if (realtimeanswerService.insert(realtimeanswer)) {
            return "success";
        } else {
            return "error";
        }
    }


 /*   //条件分页查询
    @GetMapping("getUserListByPage")
    public List<Realtimeanswer> getUserListByPage(Integer pageNumber, Integer pageSize) {
        Page<Realtimeanswer> page =new Page<>(pageNumber,pageSize);
//        EntityWrapper<Realtimeanswer> entityWrapper = new EntityWrapper<>();
//        entityWrapper.eq("user_name", "xiaoli");
        return realtimeanswerMapper.selectPage(page,null);
    }*/

    //分页查询
    @PostMapping("/selectRealtimeanswer")
    public R selectRealtimeanswer(@RequestParam Map<String, Object> map, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        PageUtils pu = realtimeanswerService.getCampusmanageList(map);
        return new R(0, "success", pu.getTotalCount(), pu.getList());
    }



}


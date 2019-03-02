package com.onlineanswer.hc.answer.controller;


import com.onlineanswer.hc.answer.entity.Realtimeanswer;
import com.onlineanswer.hc.answer.service.RealtimeanswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zqw
 * @since 2019-03-02
 */

@RestController
public class RealtimeanswerAction {

    @Autowired
    RealtimeanswerService realtimeanswerService;

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



}


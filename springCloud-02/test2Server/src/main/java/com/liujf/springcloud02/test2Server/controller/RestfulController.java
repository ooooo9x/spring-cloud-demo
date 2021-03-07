package com.liujf.springcloud02.test2Server.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liujf.springcloud02.test2Server.bo.TestBO;
import com.liujf.springcloud02.test2Server.service.RestfulService;
import com.liujf.springcloud02.test2Server.vo.ResponseVO;

@RestController
public class RestfulController {
    @Resource
    private RestfulService restfulService;

    /**
     * 
     * @return Response
     */
    @GetMapping("/test")
    public ResponseVO test() {
        ResponseVO response = new ResponseVO<>();
        response.setCode(0);
        
        TestBO testBO = new TestBO();
        testBO.setCommand(0);
        Boolean flag = restfulService.test(testBO);
        if (flag) {
            response.setMessage("test2_server config success");
        } else {
            response.setMessage("test2_server config fail");
        }
        return response;
    }
    
    @GetMapping("index")
    public String index(){
        return "Hello World!,index";
    }

}
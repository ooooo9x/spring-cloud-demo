package com.liujf.springcloud02.test2Server.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.liujf.springcloud02.test2Server.bo.TestBO;
import com.liujf.springcloud02.test2Server.dao.entity.TestEntity;
import com.liujf.springcloud02.test2Server.dao.repository.TestRepository;
import com.liujf.springcloud02.test2Server.service.RestfulService;
import com.liujf.springcloud02.test2Server.util.HttpClientUtils;

@Service
public class RestfulServiceImpl implements RestfulService {
    private final Logger logger = LoggerFactory.getLogger(RestfulServiceImpl.class);
    
    @Autowired
    private TestRepository testRepository;
    
    @Value("${test2_server.test.value0}")
    private String address;

    @Resource
    private HttpClientUtils httpClientUtils;


    @Override
    public Boolean test(TestBO testBO) {
    	logger.debug("test is start");
    	TestEntity te = testRepository.findById((long)0).orElse(null);
    	return te != null ? true : false;
    }
}
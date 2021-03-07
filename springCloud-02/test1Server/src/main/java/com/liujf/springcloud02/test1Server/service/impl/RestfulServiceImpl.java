package com.liujf.springcloud02.test1Server.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.liujf.springcloud02.test1Server.api.ApiService;
import com.liujf.springcloud02.test1Server.bo.TestBO;
import com.liujf.springcloud02.test1Server.dao.entity.TestEntity;
import com.liujf.springcloud02.test1Server.dao.repository.TestRepository;
import com.liujf.springcloud02.test1Server.service.RestfulService;
import com.liujf.springcloud02.test1Server.util.HttpClientUtils;

@Service
public class RestfulServiceImpl implements RestfulService {
    private final Logger logger = LoggerFactory.getLogger(RestfulServiceImpl.class);
    
    @Autowired
    private TestRepository testRepository;

    @Autowired
    private ApiService apiService;
    
    @Resource
    private HttpClientUtils httpClientUtils;

    @Value("${test1_server.test.value0}")
    private String address;
    
    @Override
    public Boolean test(TestBO testBO) {
    	logger.debug("test is start");
    	logger.info("feign interface result: " + apiService.index());
    	TestEntity te = testRepository.findById((long)0).orElse(null);
    	return te != null ? true : false;
    }
}
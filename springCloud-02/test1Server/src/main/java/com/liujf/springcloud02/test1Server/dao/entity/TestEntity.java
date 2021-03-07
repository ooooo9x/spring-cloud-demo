package com.liujf.springcloud02.test1Server.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_test")
public class TestEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint(64) comment '主键'")
    private Long id;
    @Column(name = "name",columnDefinition="varchar(255) DEFAULT ''")
    private String name;
    @Column(name = "type",columnDefinition="int(11)")
    private Integer type;
    
    
}
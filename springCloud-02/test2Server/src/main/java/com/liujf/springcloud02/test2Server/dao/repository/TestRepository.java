package com.liujf.springcloud02.test2Server.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.liujf.springcloud02.test2Server.dao.entity.TestEntity;

@Repository
public interface TestRepository extends JpaRepository<TestEntity,Long> {
    List<TestEntity> findByType(Integer type);

//    @Query(value = "select area from AreaEntity area,DeviceEntity device,ChannelEntity c where c.channelBearea=device.deviceId and device.deviceParentId=area.deviceId " +
//            "and c.channelId=:channelId and area.level=:level")
//    TestEntity findByChannelIdAndLevel(@Param("channelId") String channelId,@Param("level") Integer level);
}

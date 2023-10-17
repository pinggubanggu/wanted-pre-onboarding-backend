package com.example.hire.persistence;

import com.example.hire.persistence.mapper.TimeMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class TimeMapperTest {

    @Autowired
    private TimeMapper timeMapper;

    @Test
    public void testGetTime() {
        Assertions.assertNotNull(timeMapper.getTime());
        log.info("time: {}", timeMapper.getTime());
    }

    @Test
    public void testGetTime2() {
        log.info("time2 : {}", timeMapper.getTime2());
    }
}
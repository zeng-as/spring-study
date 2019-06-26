package com.as.spring.beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * desc:
 * author: as
 * date: 2019/6/18
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:application-test.xml"})
public class FirstBeanTest {

    @Autowired
    private FirstBean firstBean;

    @Autowired
    private SecondBean secondBean;

    @Test
    public void getFirstBeanInfoTest() {
        firstBean.getBeanInfo();
    }

    @Test
    public void getSecondBeanInfoTest() {
        secondBean.getBeanInfo();
    }

}

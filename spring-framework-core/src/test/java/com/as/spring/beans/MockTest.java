package com.as.spring.beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * desc:
 * author: as
 * date: 2019/6/21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:application-test.xml"})
public class MockTest {

    @Test
    public void listMockTest() {
        List list = mock(List.class);
        when(list.get(1)).thenReturn("asd");
        System.out.println(list.get(1));
    }
}

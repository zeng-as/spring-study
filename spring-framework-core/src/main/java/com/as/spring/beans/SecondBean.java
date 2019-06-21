package com.as.spring.beans;

/**
 * desc:
 * author: as
 * date: 2019/6/18
 */
public class SecondBean {

    private FirstBean firstBean;

    public void setFirstBean(FirstBean firstBean) {
        this.firstBean = firstBean;
    }

    public void getBeanInfo() {
        firstBean.getBeanInfo();
        System.out.println("second bean");
    }
}

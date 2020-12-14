package com.lf.springclould.domain;

/**
 * @Author linfan
 * @Date 2020/12/13 19:52
 * @Version 1.0
 */
public class Payment {
    private Long id;
    private String serial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}

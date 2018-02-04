package com.crm.common;

import com.google.gson.Gson;

import java.util.List;

public class JsonResult<E> {
    private Boolean success;

    private String msg;

    private Integer count;

    private List<E> data;

    public JsonResult(Boolean success, String msg, Integer count, List<E> data) {
        this.success = success;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<E> getData() {
        return data;
    }

    public void setData(List<E> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        Gson g = new Gson();
        return g.toJson(this);
    }
}

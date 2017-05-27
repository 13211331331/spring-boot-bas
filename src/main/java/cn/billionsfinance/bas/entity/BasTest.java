package cn.billionsfinance.bas.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by hanlin.huang on 2017/5/26.
 */
public class BasTest implements Serializable{

    private Long id;
    private String remark;
    private String name;
    private Date createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}

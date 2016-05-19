package com.gl.roadaccidents.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by gavin on 16-5-13.
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable{

    private static final long serialVersionUID = 1079866250610374768L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="oid")
    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Column(name="create_at")
    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    @Column(name="update_at")
    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    private Long oid;
    private Date createAt;
    private Date updateAt;

    @Override
    public String toString() {
        return "BaseEntity{" +
                "oid=" + oid +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}

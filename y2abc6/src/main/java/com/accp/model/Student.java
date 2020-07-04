package com.accp.model;

import java.util.List;

public class Student {
    private Integer sid;

    private String sname;

    private String sclass;

    private Integer szyid;
    
    private List<Kc> kcs;
    
    

    public List<Kc> getKcs() {
		return kcs;
	}

	public void setKcs(List<Kc> kcs) {
		this.kcs = kcs;
	}

	public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    public Integer getSzyid() {
        return szyid;
    }

    public void setSzyid(Integer szyid) {
        this.szyid = szyid;
    }
}
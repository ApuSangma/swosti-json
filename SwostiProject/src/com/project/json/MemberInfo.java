package com.project.json;

public class MemberInfo {
	
	private String s;
	private String c;
	private int branchOid;
	private String name;
	private String gName;
	private String nid;
	private String i;
	private String groupNo;
	private String mobileNo;
	
	public MemberInfo(String s, String c, int branchOid, String name, String gName, String nid, String i,
			String groupNo, String mobileNo) {
		super();
		this.s = s;
		this.c = c;
		this.branchOid = branchOid;
		this.name = name;
		this.gName = gName;
		this.nid = nid;
		this.i = i;
		this.groupNo = groupNo;
		this.mobileNo = mobileNo;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public int getBranchOid() {
		return branchOid;
	}

	public void setBranchOid(int branchOid) {
		this.branchOid = branchOid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public String getI() {
		return i;
	}

	public void setI(String i) {
		this.i = i;
	}

	public String getGroupNo() {
		return groupNo;
	}

	public void setGroupNo(String groupNo) {
		this.groupNo = groupNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "MemberInfo [s=" + s + ", c=" + c + ", branchOid=" + branchOid + ", name=" + name + ", gName=" + gName
				+ ", nid=" + nid + ", i=" + i + ", groupNo=" + groupNo + ", mobileNo=" + mobileNo + "]";
	}
	

}


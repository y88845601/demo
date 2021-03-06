package com.xxy.util;

/**
 * servlet返回信息封装数据辅助类
 * <p>Title: ObjectModel.java</p>
 * @author xxy 
 * @date 2014-7-26 上午10:41:39 
 * @version V1.0
 */
public class ObjectModel {
	
	private int flat = 1;	//	返回 0：成功,1：失败
	private String desc;	//	返回描述
	private Object obj;	//	返回数据集合
	public int getFlat() {
		return flat;
	}
	public void setFlat(int flat) {
		this.flat = flat;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}

}

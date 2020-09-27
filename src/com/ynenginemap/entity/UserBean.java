package com.ynenginemap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户表 table_users
 * @author zzy
 *
 */

@Entity
@Table(name="users")
public class UserBean {

	/**
	 * 用户ID
	 */
	private String uuid;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 用户权限 0-超管 1-web用户 2-app
	 */
	private String yhqx;
	/**
	 * 行政代码
	 */
	private String xzdm;
	/**
	 * 位置名称
	 */
	private String wzmc;
	/**
	 * 用户状态  0-未启用 1-启用 2-删除
	 */
	private String yhzt;
	/**
	 * 真实姓名
	 */
	private String zsxm;
	/**
	 * 单位名称
	 */
	private String dwmc;
	/**
	 * 联系电话
	 */
	private String lxdh;
	/**
	 * 邮箱
	 */
	private String yx;
	/**
	 * 添加时间
	 */
	private String tjsj;
	/**
	 * 所属单位id  app关联web用户的id
	 */
	private String ssdw;
	/**
	 * 头像
	 */
	private String tx;
	
	
	@Id
	@Column(name="uuid")
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	@Column(name="username")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name="password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="yhqx")
	public String getYhqx() {
		return yhqx;
	}
	public void setYhqx(String yhqx) {
		this.yhqx = yhqx;
	}
	@Column(name="xzdm")
	public String getXzdm() {
		return xzdm;
	}
	public void setXzdm(String xzdm) {
		this.xzdm = xzdm;
	}
	@Column(name="wzmc")
	public String getWzmc() {
		return wzmc;
	}
	public void setWzmc(String wzmc) {
		this.wzmc = wzmc;
	}
	@Column(name="yhzt")
	public String getYhzt() {
		return yhzt;
	}
	public void setYhzt(String yhzt) {
		this.yhzt = yhzt;
	}
	@Column(name="zsxm")
	public String getZsxm() {
		return zsxm;
	}
	public void setZsxm(String zsxm) {
		this.zsxm = zsxm;
	}
	@Column(name="dwmc")
	public String getDwmc() {
		return dwmc;
	}
	public void setDwmc(String dwmc) {
		this.dwmc = dwmc;
	}
	@Column(name="lxdh")
	public String getLxdh() {
		return lxdh;
	}
	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}
	@Column(name="yx")
	public String getYx() {
		return yx;
	}
	public void setYx(String yx) {
		this.yx = yx;
	}
	@Column(name="tjsj")
	public String getTjsj() {
		return tjsj;
	}
	public void setTjsj(String tjsj) {
		this.tjsj = tjsj;
	}
	@Column(name="ssdw")
	public String getSsdw() {
		return ssdw;
	}
	public void setSsdw(String ssdw) {
		this.ssdw = ssdw;
	}
	@Column(name="tx")
	public String getTx() {
		return tx;
	}
	public void setTx(String tx) {
		this.tx = tx;
	}
	
	
	
	
	
}

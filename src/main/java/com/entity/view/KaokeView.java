package com.entity.view;

import com.entity.KaokeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 考核
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kaoke")
public class KaokeView extends KaokeEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 考核类型的值
		*/
		private String kaokeValue;
		/**
		* 是否通过的值
		*/
		private String kaokeYesnoValue;



		//级联表 yonghu
			/**
			* 员工姓名
			*/
			private String yonghuName;
			/**
			* 员工手机号
			*/
			private String yonghuPhone;
			/**
			* 员工身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 现住地址
			*/
			private String yonghuAddress;
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 出生年月
			*/
			private Date yonghuTime;
			/**
			* 员工照片
			*/
			private String yonghuPhoto;
			/**
			* 部门
			*/
			private Integer bumenTypes;
				/**
				* 部门的值
				*/
				private String bumenValue;
			/**
			* 职位
			*/
			private Integer zhiweiTypes;
				/**
				* 职位的值
				*/
				private String zhiweiValue;

	public KaokeView() {

	}

	public KaokeView(KaokeEntity kaokeEntity) {
		try {
			BeanUtils.copyProperties(this, kaokeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 考核类型的值
			*/
			public String getKaokeValue() {
				return kaokeValue;
			}
			/**
			* 设置： 考核类型的值
			*/
			public void setKaokeValue(String kaokeValue) {
				this.kaokeValue = kaokeValue;
			}
			/**
			* 获取： 是否通过的值
			*/
			public String getKaokeYesnoValue() {
				return kaokeYesnoValue;
			}
			/**
			* 设置： 是否通过的值
			*/
			public void setKaokeYesnoValue(String kaokeYesnoValue) {
				this.kaokeYesnoValue = kaokeYesnoValue;
			}




















				//级联表的get和set yonghu
					/**
					* 获取： 员工姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 员工姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 员工手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 员工手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 员工身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 员工身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 现住地址
					*/
					public String getYonghuAddress() {
						return yonghuAddress;
					}
					/**
					* 设置： 现住地址
					*/
					public void setYonghuAddress(String yonghuAddress) {
						this.yonghuAddress = yonghuAddress;
					}
					/**
					* 获取： 出生年月
					*/
					public Date getYonghuTime() {
						return yonghuTime;
					}
					/**
					* 设置： 出生年月
					*/
					public void setYonghuTime(Date yonghuTime) {
						this.yonghuTime = yonghuTime;
					}
					/**
					* 获取： 员工照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 员工照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 部门
					*/
					public Integer getBumenTypes() {
						return bumenTypes;
					}
					/**
					* 设置： 部门
					*/
					public void setBumenTypes(Integer bumenTypes) {
						this.bumenTypes = bumenTypes;
					}


						/**
						* 获取： 部门的值
						*/
						public String getBumenValue() {
							return bumenValue;
						}
						/**
						* 设置： 部门的值
						*/
						public void setBumenValue(String bumenValue) {
							this.bumenValue = bumenValue;
						}
					/**
					* 获取： 职位
					*/
					public Integer getZhiweiTypes() {
						return zhiweiTypes;
					}
					/**
					* 设置： 职位
					*/
					public void setZhiweiTypes(Integer zhiweiTypes) {
						this.zhiweiTypes = zhiweiTypes;
					}


						/**
						* 获取： 职位的值
						*/
						public String getZhiweiValue() {
							return zhiweiValue;
						}
						/**
						* 设置： 职位的值
						*/
						public void setZhiweiValue(String zhiweiValue) {
							this.zhiweiValue = zhiweiValue;
						}




}

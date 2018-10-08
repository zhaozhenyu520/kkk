	package com.zzy.entity;

public class ShiJi {
		private int shijiid;
		private String jieshao;
		private double jiage;
		private String name;
		public int getShijiid() {
			return shijiid;
		}
		public void setShijiid(int shijiid) {
			this.shijiid = shijiid;
		}
		public String getJieshao() {
			return jieshao;
		}
		public void setJieshao(String jieshao) {
			this.jieshao = jieshao;
		}
		public double getJiage() {
			return jiage;
		}
		public void setJiage(double jiage) {
			this.jiage = jiage;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public ShiJi() {
			super();
			// TODO Auto-generated constructor stub
		}
		public ShiJi(int shijiid, String jieshao, double jiage, String name) {
			super();
			this.shijiid = shijiid;
			this.jieshao = jieshao;
			this.jiage = jiage;
			this.name = name;
		}
		
}	

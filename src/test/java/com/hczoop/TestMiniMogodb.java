package com.hczoop;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.hczoop.MiniMogodb;

public class TestMiniMogodb {
	private static final String database_name  = "mini-mongodb.xml";
	
	
	/**
	 * 创建数据库
	 */
	@Test
	public void createDatabse(){
		try {
			MiniMogodb dao = new MiniMogodb();
			dao.createDataBase(database_name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 插入数据
	 */
	@Test
	public void insertData(){
		Person po = new Person();
		po.setName("hczoop");
		po.setAge(20);
		po.setMoney(2000.98);
		po.setSex("男");
		try {
			MiniMogodb dao = new MiniMogodb();
			dao.addData(database_name,"test",po);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 修改数据
	 */
	@Test
	public void updateData(){
		Person po = new Person();
		po.set_uuid("7e1f05af-0077-4ec6-a775-e9be81089bc0");
		po.setName("xingxing");
		po.setAge(28);
		try {
			MiniMogodb dao = new MiniMogodb();
			dao.updateData(database_name,"test",po);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 删除数据
	 */
	@Test
	public void deleteData(){
		Person po = new Person();
		po.set_uuid("ccaa715f-b427-4901-a416-9c9f2f216cfb");
		try {
			MiniMogodb dao = new MiniMogodb();
			dao.deleteData(database_name,"test",po);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取所有数据
	 */
	@Test
	public void listAll(){
		try {
			MiniMogodb dao = new MiniMogodb();
			List<Map> list = dao.loadTableDatas(database_name,"test");
			System.out.println(list.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

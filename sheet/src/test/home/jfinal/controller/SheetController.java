package test.home.jfinal.controller;

import org.apache.ibatis.session.SqlSession;

import test.db.helper.MySQLHelper;

import com.jfinal.core.Controller;

public class SheetController extends Controller {
	public void index(){
		SqlSession session = MySQLHelper.getSqlSessionFactory().openSession();
		session.select("test.db.mapping.SheetMapper.getAllAproveSheetByUserName", null);
		render("index.html");
	}

}

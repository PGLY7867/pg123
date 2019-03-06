package LY.Service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import LY.Dao.NewDao;
import LY.Entity.New;
import LY.mybatis.SqlFactory;

public class NewService {

	public int add(  New obj) {
	SqlSession session = SqlFactory.getSqlSession();
	try {
		NewDao dao = session.getMapper(NewDao.class);
		return dao.add(obj);
	} finally {
		// TODO: handle finally clause
		session.close();
	}
}
public List<New>selectAll(){
	SqlSession session = SqlFactory.getSqlSession();
	try {
		NewDao dao = session.getMapper(NewDao.class);
		return dao.selectAll();
	} finally {
	
		session.close();
	}
}
public static void main(String[] args) {
	NewService ns =  new NewService();
	New ew = new New();
	ew.setName("wangxiang");
	ew.setAge(11);
	ew.setSex("ÄÐ");
	ns.add(ew);
}
}

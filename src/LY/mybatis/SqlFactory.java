package LY.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlFactory {
	public final static SqlSessionFactory sqlSqlSessionFactory;
	static {
		String resource="config/mybatis-config.xml";
		InputStream inputStream;
	SqlSessionFactory temp= null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			temp = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			// TODO: handle exception
		}
		sqlSqlSessionFactory = temp;
	}
	public static SqlSession getSqlSession() {
		return sqlSqlSessionFactory.openSession();
	}
}

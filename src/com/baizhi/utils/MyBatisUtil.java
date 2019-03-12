package com.baizhi.utils;
import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private static final ThreadLocal<SqlSession> tl = new ThreadLocal<SqlSession>();
	private static SqlSessionFactory sessionFactory = null;
	static{
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static SqlSession getSqlSession(){
		SqlSession sqlSession = tl.get();
		if(sqlSession == null){
			sqlSession = sessionFactory.openSession();
			tl.set(sqlSession);
		}
		return sqlSession;
	}
	public static void close(){
		getSqlSession().close();
		tl.remove();
	}
	public static Object getMapper(Class c){
		Object mapper = getSqlSession().getMapper(c);
		return mapper;
	}
	public static void commit(){
		getSqlSession().commit();
		close();
	}
	public static void rollback(){
		getSqlSession().rollback();
		close();
	}
}
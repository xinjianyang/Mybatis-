package com.kaishengit.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author User
 * @date 2017/10/23
 */
public class MybatisUtil {

    private static SqlSessionFactory sqlSessionFactory;

    static{

        try {
            Reader reader = Resources.getResourceAsReader("Mybatis.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSqlSessionFactory(){
        return sqlSessionFactory;
    }


    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}

package om.kaishengit.test;

import com.kaishengit.entity.Student;
import com.kaishengit.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by User on 2017/10/23.
 */
public class MybatisTestCase {

    @Test
    public void save(){

        Student student = new Student("杨新见","夏邑县");

        SqlSession sqlSession = MybatisUtil.getSqlSession();
        sqlSession.insert("com.kaishengit.mapper.StudentMapper.save",student);

        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void update(){


        SqlSession sqlSession = MybatisUtil.getSqlSession();
        Student student =  sqlSession.selectOne("com.kaishengit.mapper.StudentMapper.findById",8);
        System.out.println(student);
        student.setStuName("apple");
        sqlSession.update("com.kaishengit.mapper.StudentMapper.update",student);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void findAll(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        List<Student> studentList = sqlSession.selectList("com.kaishengit.mapper.StudentMapper.findAll");
        for (Student student : studentList){
            System.out.println(student);
        }
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void findById(){

        SqlSession sqlSession = MybatisUtil.getSqlSession();
        Student student = sqlSession.selectOne("com.kaishengit.mapper.StudentMapper.findById",8);
        System.out.println(student);
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void delete(){

        SqlSession sqlSession = MybatisUtil.getSqlSession();
        sqlSession.delete("com.kaishengit.mapper.StudentMapper.delete",10);
        sqlSession.commit();
        sqlSession.close();
    }

}

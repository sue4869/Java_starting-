package day0815;

import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:WebContent/WEB-INF/spring/root_context.xml")
public class JDBCTest {

	//스프링 컨테이터에 들어 있는 datasource빈을 가져오자
	@Autowired
	DataSource dataSource;
	
	@Test
	public void test() {
		assertNotNull(dataSource);
	}

}

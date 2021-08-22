package user;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
	// 실제 쿼리를 실행해줄 메서드들 정의.
	
	//유저삽입                   //컬럼 명                                  //파라미터로 받아온 아이의 필드명 적기
	@Insert("insert into user(id, user_id,password,birth_date,join_date) values(#{id},#{userId},#{password},#{birthDate},#{joinDate})")
	public void insertUser(User user);

	//유저 리스트 조회
	@Select("select id, user_id, password, birth_date, join_date from user order by id desc")
	public List<User> selectAll(); //반복안하고 mybatis로 바로 가능
}

package user;

import java.util.List;

<<<<<<< HEAD
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
=======
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
>>>>>>> serve

@Mapper
public interface UserMapper {
	// 실제 쿼리를 실행해줄 메서드들 정의.
	
	//유저삽입                   //컬럼 명                                  //파라미터로 받아온 아이의 필드명 적기
	@Insert("insert into user(id, user_id,password,birth_date,join_date) values(#{id},#{userId},#{password},#{birthDate},#{joinDate})")
	public void insertUser(User user);

	//유저 리스트 조회
	@Select("select id, user_id, password, birth_date, join_date from user order by id desc")
	public List<User> selectAll(); //반복안하고 mybatis로 바로 가능
<<<<<<< HEAD
=======

	//유저 아이디로 조회
	@Select("select id,user_id,password,birth_date,join_date from user where id=#{id}")
	public User selectUserById(int id);

	
	@Update("update user set user_id=#{userId},password=#{password},birth_date=#{birthDate}, join_date=#{joinDate} where id=#{id}")
	public int updateUser(User user);

	//삭제
	@Delete("delete from user where id=#{id} ")
	public int deleteUserById(int id);
>>>>>>> serve
}

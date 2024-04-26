package basic.exercise.interfaces;

public class UserInfoMySqlDaoImpl implements IUserInfoDao {

	@Override
	public void insertUserInfo(UserInfo info) {
		// SQL : 질의어를 배웠다면 MySQL 언어를 활용해서 구현할 테지만 아직 배우지 않았으니 출력만 해보기.
		System.out.println("insert into user valus(info.getUserName())");
	}

	@Override
	public void updateUserInfo(UserInfo info) {
		System.out.println("update set user_tb name = info.getUserName()");
	}

	@Override
	public void deleteUserInfo(int id) {
		System.out.println("delete from user_tb where id = info.getId()");
	}

	@Override
	public void selectUserInfo() {
		System.out.println("select * from user_tb");
	}

}

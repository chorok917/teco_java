package basic.exercise.interfaces;

public interface IUserInfoDao {

	// interface에서는 public abstract 생략 가능
	// CRUD
	// TODO - 매개변수 수정 예정
	public abstract void insertUserInfo(UserInfo info);

	// 단 수정이 되면 안되는 것은 제외.
	public abstract void updateUserInfo(UserInfo info);

	// 이름을 넣으면 동명이인인 경우 함께 삭제되니 pk 의미인 id로 정보 삭제한다.
	public abstract void deleteUserInfo(int id);

	public abstract void selectUserInfo();// 전체조회

}

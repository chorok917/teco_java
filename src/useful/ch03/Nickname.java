package useful.ch03;

public class Nickname {

	// field
	String nickName;

	// Constructor
	public Nickname() {

	}

	// methods
	// getter
	public String getNickName() {
		return nickName;
	}

	// setter
	public void setNickName(String nickName) throws NicknameException {

		// null 값은 안된다.
		if (nickName == null) {
			throw new NicknameException("닉네임을 설정하지 않으셨습니다.");
		}
		// 닉네임은 한 글자가 될 수 없다.
		if (nickName.length() < 2) {
			throw new NicknameException("닉네임은 한 글자일 수 없습니다.");
		}
		// 닉네임에 특수문자는 넣을 수 없다.
		if(nickName.matches("^[!@#$%^&*()]")) {
			throw new NicknameException("...");
		}

		// 멤버 변수 = 매개 변수
		this.nickName = nickName;

	}
}

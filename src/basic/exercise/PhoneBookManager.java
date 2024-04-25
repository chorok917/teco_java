package basic.exercise;

import java.util.Scanner;

public class PhoneBookManager {

	static int LAST_INDENX_NUMBER = 0;

	public static void main(String[] args) {

		// 배열 선언 100개
		PhoneBook[] phBooks = new PhoneBook[100];

		// 스캐너
		Scanner sc = new Scanner(System.in);

		// 선택지
		final String SAVE = "1";
		final String CHECK = "2";
		final String UPDATE = "3";
		final String DELETE = "4";
		final String SELECT_CHECK = "5";
		final String SELECT_DELETE = "6";
		final String END = "0";
		// 숫자가 아니라 문자열로 바라보는 String nextLine 틀렸다.
		// int choiceMenu = sc.nextInt();라고 썼었다.

		// 샘플 데이터
		phBooks[0] = new PhoneBook("김아무개", "010-1234-5678");
		phBooks[1] = new PhoneBook("구급차", "119");
		phBooks[2] = new PhoneBook("경찰차", "112");

		// start of while
		boolean flag = true;
		while (flag) {
			System.out.println("\n번호로 메뉴를 선택하세요.");
			System.out.println("1.저장 2.조회 3.수정 4.삭제 5.선택조회 6.선택삭제 0.종료");
			String choiceMenu = sc.nextLine();

			if (choiceMenu.equals(SAVE)) {
				System.out.println("[ 저장을 선택하셨습니다. ]");
				savePhone(sc, phBooks);
			} else if (choiceMenu.equals(CHECK)) {
				System.out.println("[ 조회를 선택하셨습니다. ]");
				checkPhone(phBooks);
			} else if (choiceMenu.equals(UPDATE)) {
				System.out.println("[ 수정을 선택하셨습니다. ]");
				updatePhone(sc, phBooks);
			} else if (choiceMenu.equals(DELETE)) {
				System.out.println("[ 삭제를 선택하셨습니다. ]");
				deletePhone(phBooks);
			} else if (choiceMenu.equals(SELECT_CHECK)) {
				System.out.println("[ 선택조회를 선택하셨습니다. ]");
				oneCheckPhone(sc, phBooks);
			} else if (choiceMenu.equals(SELECT_DELETE)) {
				System.out.println("[ 선택삭제를 선택하셨습니다. ]");
				oneDelete(sc, phBooks);
			} else if (choiceMenu.equals(END)) {
				System.out.println("[ 종료하겠습니다. ]");
				break;
			} else {
				System.out.println("[ 잘못된 선택입니다. 처음부터 다시 시도하세요. ]");
			}
		}

	}// end of main

	////// S: SAVE //////
	public static void savePhone(Scanner sc, PhoneBook[] phBooks) {

		System.out.println("\n>>>>성함을 입력해주세요.");
		String phoneName = sc.nextLine();

		System.out.println(">>>>하이픈과 함께 전화번호를 입력해주세요.");
		String phoneNumber = sc.nextLine();

		PhoneBook phBook = new PhoneBook(phoneName, phoneNumber);

		if (LAST_INDENX_NUMBER >= phBooks.length) {
			System.out.println(">>>>저장 공간이 부족합니다.");
			return;
		}

		System.out.println(">>>>" + phoneName + " 저장이 완료되었습니다.");

		for (int i = 0; i < phBooks.length; i++) {
			if (phBooks[i] == null) {
				phBooks[i] = phBook;
				LAST_INDENX_NUMBER++;
				break;
			}
		}
	}// E : SAVE

	// S : CHECK
	public static void checkPhone(PhoneBook[] phBooks) {
		System.out.println("\n>>>>전화번호부를 전체 조회하겠습니다.");
		System.out.println("* * * * * * * * * * * * * * *");
		for (int i = 0; i < phBooks.length; i++) {
			if (phBooks[i] != null) {
				System.out.println(phBooks[i].getName() + "  " + phBooks[i].getPhoneNumber());
				System.out.println("* * * * * * * * * * * * * * *");
			}
		}
	}// E : CHECK

	// S : UPDATE
	public static void updatePhone(Scanner sc, PhoneBook[] phBooks) {
		final String choiceName = "1";
		final String choiceNumber = "2";

		System.out.println("\n>>>>기존에 저장하신 이름을 입력해주세요.");
		String beforeName = sc.nextLine();

		for (int i = 0; i < phBooks.length; i++) {
			if (phBooks[i] != null) {
				if (beforeName.equals(phBooks[i].getName())) {

					System.out.println(">>>>어느 것을 수정하시겠습니까?");
					System.out.println("1.이름 2.전화번호");
					String updateChoice = sc.nextLine();

					if (updateChoice.equals(choiceName)) {
						System.out.println(">>>>수정하실 이름을 입력해주세요.");
						String afterName = sc.nextLine();

						phBooks[i].setName(afterName);
						System.out.println("'" + afterName + "'" + "으로 수정했습니다.");
					} else if (updateChoice.equals(choiceNumber)) {
						System.out.println(">>>>수정하실 전화번호를 입력해주세요.");
						String afterNumber = sc.nextLine();

						phBooks[i].setPhoneNumber(afterNumber);
						System.out.println("'" + afterNumber + "'" + "으로 수정했습니다.");

					} else {
						System.out.println(">>>>잘못된 선택입니다. 처음으로 돌아갑니다.");
					}

				} else {
					System.out.println("해당 이름을 찾지 못했습니다. 처음으로 돌아갑니다.");
				}
			}
		}

	}
	// E : UPDATE

	// S : DELETE
	public static void deletePhone(PhoneBook[] phBooks) {
		for (int i = 0; i < phBooks.length; i++) {
			phBooks[i] = null;
		}
	}
	// E : DELETE

	// S : SELECT_CHECK
	public static void oneCheckPhone(Scanner sc, PhoneBook[] phBooks) {
		final String goBack = "0";
		final String searchName = "1";
		final String searchNumber = "2";
		boolean isFind = false;

		System.out.println("\n>>>>조회하실 방법을 선택해주세요.");
		System.out.println("1.이름으로 조회하기 2.전화번호로 조회하기 0.메뉴 다시 선택하기");
		String search = sc.nextLine();

		if (search.equals(searchName)) {
			System.out.println(">>>>검색할 이름을 입력하세요.");
			String enterName = sc.nextLine();

			for (int i = 0; i < phBooks.length; i++) {
				if (phBooks[i] != null) {
					if (enterName.equals(phBooks[i].getName())) {
						System.out.println(phBooks[i].getName() + "\t" + phBooks[i].getPhoneNumber());
						isFind = true;
						break;
					}
				}
			}
			if (isFind == false) {
				System.out.println("해당 이름은 존재하지 않습니다.");
			}
		}

		if (search.equals(searchNumber)) {
			System.out.println(">>>>검색할 전화번호를 입력하세요.");
			String enterNumber = sc.nextLine();

			for (int i = 0; i < phBooks.length; i++) {
				if (phBooks[i] != null) {
					if (enterNumber.equals(phBooks[i].getPhoneNumber())) {
						System.out.println(phBooks[i].getName() + phBooks[i].getPhoneNumber());
						isFind = true;
						break;
					}
				}
			}
			if (isFind == false) {
				System.out.println("해당 전화번호는 존재하지 않습니다.");
			}
		}

		if (search.equals(goBack)) {
			System.out.println("메뉴로 돌아가겠습니다.");
			return;
		}

	}
	// E : SELECT_CHECK

	// S: SELECT_DELETE
	public static void oneDelete(Scanner sc, PhoneBook[] phBooks) {
		System.out.println("삭제할 이름 또는 전화번호를 입력하세요.");
		String enterDelete = sc.nextLine();
		for (int i = 0; i < phBooks.length; i++) {
			if (phBooks[i] != null) {
				if (enterDelete.equals(phBooks[i].getName()) || enterDelete.equals(phBooks[i].getPhoneNumber())) {
					System.out.println(phBooks[i].getName()+phBooks[i].getPhoneNumber()+" 삭제했습니다.");
					phBooks[i] = null;
				}
			}
		}
	}
	// E: SELECT_DELETE

}// end of class

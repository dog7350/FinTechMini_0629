package member;

import java.util.*;

import myinfo.*;

public class MemberService implements MemberInterface {
	//	회원 가입(join), 
	//	로그인(login), 로그아웃(logout), 회원 정보 수정(modify), 
	//	회원 탈퇴(delete)
	private static MemberService instance = null;
	private MemberService() {}
	public static MemberService getInstance() {
		if (instance == null) instance = new MemberService();
		return instance;
	}

	Scanner sc = new Scanner(System.in);
	ArrayList<UserInfo> list = new ArrayList<>();

	MyInfo info = MyInfo.getInstance();
	boolean bool = true;
	@Override
	public void join() {
		UserInfo user = new UserInfo();
		System.out.println("===회원 가입===");
		System.out.println("가입할 아이디 입력 : ");
		user.setId(sc.next());
		System.out.println("가입할 비밀번호 입력 : ");
		user.setPw(sc.next());
		System.out.println("가입할 이름 입력 : ");
		user.setName(sc.next());
		System.out.println("가입할 나이 입력 : ");
		user.setAge(sc.next());
		System.out.println("가입할 주소 입력 : ");
		user.setAddress(sc.next());
		System.out.println("관리자번호 : ");
		if(sc.nextInt() == 1234) {
			user.setAdmin(true);
			System.out.println("관리자");
		}else {
			user.setAdmin(false);
			System.out.println("회원");
		}
		list.add(user);
	}
	@Override
	public void login() {
		System.out.println("아이디 입력 : ");
		String id = sc.next();
		System.out.println("비밀번호 입력 : ");
		String pw = sc.next();
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId().equals(id)) {
				if(list.get(i).getPw().equals(pw)) {
					System.out.println("로그인성공!!!");
					MyInfo.setMyInfo(list.get(i));
					return;
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}else {
				System.out.println("아이디가 틀렸습니다.");
			}
		}
	}
	@Override
	public void logout() {
		MyInfo.deleteMyInfo();
	}
	@Override
	public void modify() {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId().equals(MyInfo.getId())) {
				System.out.print("변경할 비밀번호:");
				list.get(i).setPw(sc.next());
				System.out.print("변경할 나이:");
				list.get(i).setAge(sc.next());
				System.out.print("변경할 주소:");
				list.get(i).setAddress(sc.next());
				MyInfo.setMyInfo(list.get(i));
				System.out.println("변경되었습니다.");
			}
		}
	}
	@Override
	public void delete() {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId().equals(MyInfo.getId())) {
				list.remove(i);
				MyInfo.deleteMyInfo();
			}
		}
	}
}

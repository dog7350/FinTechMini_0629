package member;

import java.util.*;

import myinfo.*;

public class MemberService implements MemberInterface {
	private static MemberService instance = null;
	private MemberService() {}
	public static MemberService getInstance() {
		if (instance == null) instance = new MemberService();
		return instance;
	}
	
	MyInfo info = MyInfo.getInstance();
	
	
}

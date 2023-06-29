import java.util.*;

import board.*;
import member.*;
import product.*;
import myinfo.*;

/*
	1. 메인
		각 모듈로의 이동 메뉴 및 통합 기능
		로그인 시 프로그램 병렬 처리로 GUI 화면을 띄우며 상품 주문이 들어갈 경우 GUI에 실시간으로 갱신된다.
	
	2. 회원 관리
		회원 가입(join), 로그인(login), 로그아웃(logout), 회원 정보 수정(modify), 회원 탈퇴(delete)의 기능이 들어가 있으며 회원 가입 시 Id, Pw, Name, Address, Age, Admin 여부를 기입한다.
		회원은 여러 명 관리가 가능하지만 로그인은 한 명만 이뤄질 수 있고 로그인 시 로그인이 유지될 수 있도록하며, 로그아웃 시 다른 모든 기능을 사용할 수 없다.
		
	3. 상품 관리
		상품 등록(pInsert), 상품 정보 수정(pModify), 상품 주문(pOrder), 상품 삭제(pDelete)의 기능이 들어가 있으며 상품 주문을 제외한 모든 기능은 관리자만 사용할 수 있다.
		상품은 여러 개 관리가 가능하며 상품의 정보는 상품 번호(pNo), 상품명(pName), 상품 내용(pContent), 상품 가격(price), 카테고리(category)가 있다.
		
	4. 게시판 관리
		게시판 등록(bInsert), 게시판 수정(bModify), 게시판 삭제(bDelete), 댓글 작성(cInsert) 기능이 들어가 있으며 로그인이 된 경우에만 모든 기능을 사용할 수 있다.
		게시판은 제목, 내용, 작성자, 댓글수가 있고 댓글은 게시판 번호, 내용, 작성자가 있으며 게시판이 삭제될 경우 해당 게시판에 종속된 모든 댓글이 삭제된다.
*/

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BoardService board = BoardService.getInstance();
		MemberService member = MemberService.getInstance();
		ProductService product = ProductService.getInstace();
		
		boolean flag = true;
		
		while (flag) {
			System.out.println("\n1. 회원관리(회원 가입, 로그인, 로그아웃, 회원 정보 수정, 회원 탈퇴)\n2. 상품관리(상품 등록, 상품 정보 수정, 상품 주문, 상품 삭제)\n"
					+ "3. 게시판 관리(게시판 등록, 게시판 수정, 게시판 삭제, 댓글 작성)");
			switch(sc.nextInt()) {
			
			}
		}
	}
}
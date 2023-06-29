package board;
//게시판 등록(bInsert), 게시판 수정(bModify), 게시판 삭제(bDelete), 댓글 작성(cInsert) 
import java.util.*;

import myinfo.*;

public class BoardService implements BoardInterface {

	private static BoardService instance = null;
	private BoardService() {}
	public static BoardService getInstance() {
		if (instance == null) instance = new BoardService();
		return instance;
	}	

	MyInfo info = MyInfo.getInstance();
	Scanner input = new Scanner(System.in);
	ArrayList<BoardDTO> board = new ArrayList<>(); 
	ArrayList<CommentDTO> comment = new ArrayList<>(); 

	boolean check = true;
	int choice;
	static int num = 0;

	public void bInsert() {//게시판등록
		BoardDTO dto = new BoardDTO();
		dto.setbWriter(info.getId());
		System.out.println("게시글 제목>>");
		dto.setbTitle(input.next());
		System.out.println("게시글 내용>>");
		dto.setbContent(input.next());
		num++;
		dto.setbNum(num);
		board.add(dto);
	}

	public void bModify() {//게시판수정
		//번호, 작성자아이디==로그인한아이디
		System.out.println("수정할 게시글 번호 입력>>");
		int bModiNum=input.nextInt();

		for(int i=0; i<board.size();i++) {
			if(bModiNum==board.get(i).getbNum()) {
				if(info.getId().equals(board.get(i).getbWriter())) {
					System.out.println("게시글 제목>>");
					board.get(i).setbTitle(input.next());
					System.out.println("게시글 내용>>");
					board.get(i).setbContent(input.next());
					System.out.println("게시글이 수정되었습니다.");
				}else {
					return;
				}
			}else
				return;
		}
	}

	public void bDelete() {//게시판삭제
		System.out.println("삭제할 게시판의 번호 입력>>");
		int bDelNum=input.nextInt();

		for(int i=0; i<board.size();i++) {
			if(bDelNum==board.get(i).getbNum()) {
				if(info.getId().equals(board.get(i).getbWriter())){
					board.remove(i);
					System.out.println("게시글이 삭제되었습니다.");
				}else
					return;
			}else
				return;
		}

	}

	public void cInsert() {//댓글작성
		CommentDTO dto = new CommentDTO();
		System.out.println("댓글 작성할 게시글 번호 입력>>");
		int cInNum = input.nextInt();

		for(int i=0; i<board.size();i++) {
			if(cInNum==board.get(i).getbNum()) {
				System.out.println("댓글 내용 입력>>");
				dto.setcContent(input.next());
				comment.add(dto);

				return;
			}
		}
		System.out.println("댓글을 작성할 게시글이 없습니다.");

	}
}

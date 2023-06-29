package board;
//게시판 등록(bInsert), 게시판 수정(bModify), 게시판 삭제(bDelete), 댓글 작성(cInsert) 
public interface BoardInterface {
	public void bInsert();
	public void bModify();
	public void bDelete();
	public void cInsert();
}

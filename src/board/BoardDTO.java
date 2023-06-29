package board;

public class BoardDTO {

	//게시판 번호, 제목, 내용, 작성자, 댓글수, 글은 게시판 번호, 내용, 작성자
	
	private int bNum; //게시글 번호
	private String bTitle; //게시글 제목 
	private String bContent; //게시글내용
	private String bWriter; //게시글 작성자
	
	
	public int getbNum() {
		return bNum;
	}
	public void setbNum(int bNum) {
		this.bNum = bNum;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public String getbWriter() {
		return bWriter;
	}
	public void setbWriter(String bWriter) {
		this.bWriter = bWriter;
	}
	
	
	
	
}

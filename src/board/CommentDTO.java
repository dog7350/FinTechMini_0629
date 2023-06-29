package board;

public class CommentDTO {

	private int cNum; //댓글번호(댓글수)
	private String cContent; //댓글내용
	private String cWriter; //댓글작성자
	
	public int getcNum() {
		return cNum;
	}
	public void setcNum(int cNum) {
		this.cNum = cNum;
	}
	public String getcContent() {
		return cContent;
	}
	public void setcContent(String cContent) {
		this.cContent = cContent;
	}
	public String getcWriter() {
		return cWriter;
	}
	public void setcWriter(String cWriter) {
		this.cWriter = cWriter;
	}
	
	
	
}

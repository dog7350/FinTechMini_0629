package board;

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
	
	
}

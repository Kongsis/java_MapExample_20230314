package day11;

import java.util.*;

public class BoardRepository {
//	private List<BoardDTO> list = new ArrayList<>();
	Map<String, BoardDTO> board = new HashMap<>();
	
	/*
	 * 리턴타입 : 
	 * 메서드이름 : 
	 * 매개변수 : 
	 */
	public boolean save(BoardDTO boardDTO) {
		if(board.put(boardDTO.getBno(),boardDTO)==null) {
			return true;
		}
		return false;
	}
	public Map<String, BoardDTO> findAll() {
		return board;
	}
	public BoardDTO findById(String bno) {
		/*
		 * map 반복문 돌리고
		 * bno 와 일치하는 객체를 찾고
		 * 찾으면 리턴
		 */
		for(String b : board.keySet()) {
			if(bno.equals(board.get(b).getBno())) {
				return board.get(b);
			}
		}
		return null;
	}
	public boolean update(BoardDTO boardDTO, String bno) {
		for(String b : board.keySet()) {
			if(bno.equals(board.get(b).getBno())) {
				board.get(b).setTitle(boardDTO.getTitle());
				board.get(b).setWriter(boardDTO.getWriter());
				return true;
			}
		}
		return false;
	}
	public boolean updateNew(String bno, String updateTitle, String updateWriter) {
		for(String b : board.keySet()) {
			if(bno.equals(board.get(b).getBno())) {
				board.get(b).setTitle(updateTitle);
				board.get(b).setWriter(updateWriter);
				return true;
			}
		}
		return false;
	}
	//refactoring
	public boolean delete(String bno) {
		for(String b : board.keySet()) {
			if(bno.equals(board.get(b).getBno())) {
				board.remove(b);
				return true;
			}
		}
		return false;
	}
	public List<BoardDTO> search(String name) {
		// 검색결과를 담을 리스트 만들기
		List<BoardDTO> serchList = new ArrayList<>();
		for(String n : board.keySet()) {
			if(name.equals(board.get(n).getWriter())) {
				serchList.add(board.get(n));
			}
		}
		return serchList;
	}
}

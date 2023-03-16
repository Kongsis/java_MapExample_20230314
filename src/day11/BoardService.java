package day11;

import java.util.*;

public class BoardService {
	BoardRepository br = new BoardRepository();
	Scanner sc = new Scanner(System.in);
	
	public void save() {
		BoardDTO boardDTO = new BoardDTO();
		System.out.print("제목> ");
		boardDTO.setTitle(sc.nextLine());
		System.out.print("작성자> ");
		boardDTO.setWriter(sc.next());sc.nextLine();
		boolean success = br.save(boardDTO);
		if(success) {
			System.out.println("게시글 등록완료!");
		}else {
			System.out.println("게시글 등록실패ㅜ");
		}
	}
	public void findAll() {
		Map<String, BoardDTO> board = br.findAll();
		System.out.println("글번호\t제목\t\t작성자\t조회수\t게시일");
		System.out.println("---------------------------------------------------------");	
		
		Map<String, BoardDTO> sortedMap = new TreeMap<>(board);
//		System.out.println(sortedMap.toString());
		for(String b : sortedMap.keySet()) {
			System.out.println(board.get(b));
		}
//		 List<String> keySet = new ArrayList<>(board.keySet());
//	        Collections.sort(keySet); // 키 값으로 오름차순 정렬
//		for(String b : keySet) {
//			System.out.println(board.get(b));
//		}
	}
	public void findById() {
		System.out.print("읽을 글번호> ");
		String bno = sc.next();
		BoardDTO boardDTO = br.findById(bno);
		if(boardDTO == null) {
			System.out.println("찾을 수 없는 글입니다");
		}else {
			boardDTO.increaseCnt();
			System.out.println("글번호\t제목\t\t작성자\t조회수\t게시일");
			System.out.println("---------------------------------------------------------");
			System.out.println(boardDTO.toString());
		}
	}
	public void update() {
		System.out.print("수정할 글번호> ");
		String bno = sc.next();sc.nextLine();
		BoardDTO b = br.findById(bno);
		if(b == null) {
			System.out.println("조회할 수 없는 글번호 입니다");
		}else {
//			BoardDTO boardDTO = new BoardDTO();
			System.out.print("수정할 제목> ");
			String updateTitle = sc.nextLine();
//			boardDTO.setTitle(sc.nextLine());
			System.out.print("수정할 작성자> ");
			String updateWriter = sc.next();sc.nextLine();
//			boardDTO.setWriter(sc.next());
			if(br.updateNew(bno, updateTitle, updateWriter)) {
				System.out.println("업데이트 성공");
			}else {
				System.out.println("업데이트 실패");
			}
		}
	}
	public void delete() {
		System.out.print("삭제할 글번호> ");
		String bno = sc.next();sc.nextLine();
		if(br.delete(bno)) {
			System.out.println("삭제완료");
		}else {
			System.out.println("삭제실패");
		}
	}
	public void testDate() {
		for(int i=1; i<6; i++) {
			BoardDTO boardDTO = new BoardDTO();
			boardDTO.setTitle("title" + i);
			boardDTO.setWriter("writer" + i);
			br.save(boardDTO);
			System.out.println(boardDTO.toString());
		}
	}
	public void search() {
		System.out.print("검색어> ");
		String name = sc.next();sc.nextLine();
		List<BoardDTO> serchList = br.search(name);
		System.out.println("글번호\t제목\t\t작성자\t조회수\t게시일");
		System.out.println("---------------------------------------------------------");
		for(BoardDTO b : serchList) {
			System.out.println(b.toString());
		}
	}
}

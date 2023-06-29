package product;

import java.util.*;

import myinfo.*;

public class ProductService implements ProductInterface {
	private static ProductService instance = null;
	private ProductService() {}
	public static ProductService getInstace() {
		if (instance == null) instance = new ProductService();
		return instance;
	}

	MyInfo info = MyInfo.getInstance();


	ArrayList<productDTO> arr = new ArrayList<>();
	public static ArrayList<Object[]> order = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	int num;
	static int pNo = 1;

	//상품등록
	public void pInsert() {
		if(checkAdmin() == true){
			productDTO dto = new productDTO();
			dto.setpNo(pNo++);
			System.out.print("상품명 : ");
			dto.setpName(sc.next());
			System.out.print("상품 내용 : ");
			dto.setpContent(sc.next());
			System.out.print("상품 가격 : ");
			dto.setPrice(sc.nextInt());
			System.out.print("카테고리 : ");
			dto.setCategory(sc.next());
			arr.add(dto);
			System.out.println("상품이 등록 되었습니다.");}
	}

	//상품 정보 수정
	public void pModify() {
		if(checkAdmin() == true){
		System.out.print("수정할 상품 번호 : ");
		num = sc.nextInt();
		for(int i =0; i<arr.size(); i++) {
			if(arr.get(i).getpNo() == num) {
				System.out.print("기존 상품명 : "+arr.get(i).getpName()+" --> 변경할 상품명 : ");
				arr.get(i).setpName(sc.next());
				System.out.print("기존 상품 내용 : "+arr.get(i).getpContent()+" --> 상품 내용 : ");
				arr.get(i).setpContent(sc.next());
				System.out.print("기존 상품 가격 : "+arr.get(i).getPrice()+" --> 상품 가격 : ");
				arr.get(i).setPrice(sc.nextInt());
				System.out.print("기존 상품 카테고리 : "+arr.get(i).getCategory()+" --> 카테고리 : ");
				arr.get(i).setCategory(sc.next());
				System.out.println("상품 정보가 수정되었습니다.");
				return;
			}
		}
		System.out.println("없는 상품 번호 입니다.");
		}
	}

	//상품 주문
	public void pOrder() {
		System.out.print("주문할 상품 번호 : ");
		num = sc.nextInt();
		int i;
		
		for(i=0; i<arr.size(); i++) 
			if (arr.get(i).getpNo() == num) break;
		
		if (i - 1 > arr.size()) {
			System.out.println("없는 상품 번호입니다.");
			return;
		}
		
		System.out.print("갯수 입력 : ");
		int count = sc.nextInt();
		
		Object[] obj = new Object[2];
		obj[0] = arr.get(i - 1);
		obj[1] = count;
		order.add(obj);
	}
	
	//상품 삭제
	public void pDelete() {
		if(checkAdmin() == true){
		System.out.print("삭제할 상품 번호 : ");
		num = sc.nextInt();
		for(int i =0; i<arr.size(); i++) {
			if(arr.get(i).getpNo() == num) {
				arr.remove(i);
				System.out.println("상품이 삭제 되었습니다.");
				return;
			}
		}
		System.out.println("없는 상품 번호 입니다.");
		}
	}

	public boolean checkAdmin() {
		if(info.getAdmin() == false) {
			System.out.println("관리자만 실행 가능합니다.");
			return false;
		}
		return true;
	}

}

package com.test;

import java.util.ArrayList;
import java.util.Iterator;

public class JDBCTest {
	
	public static void main(String[] args) {
		
		
		//DAO클래스의 필요한 함수 호출 db연동
		DeptDAO dao = new DeptDAO();
		//dao.selectAllDept();
		
		//DeptDTO dto = new DeptDTO(99,"개발","서울");
		//dao.InsertDept(dto);
		                                                                                                                                                                                                                                                                                            
		//dao.InsertDept(new DeptDTO(99, "개발", "서울"));
		/*
		DeptDTO dto = dao.selectByDeptno(99);
		System.out.println(dto);
		*/
		ArrayList<DeptDTO> list = dao.getAllData();
		/*
		for(DeptDTO lists : list) {
			System.out.println(lists);
		};
		*/
		/*
		Iterator<DeptDTO> lte = list.iterator();
		while (ite.hasNext()) {
			DeptDTO dat = (DeptDTO) ite.next();
			System.out.println(dat);
		}
		*/
	
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
	}
	
}
/*
main에 전체 데이터를 전달해주는 함수를 만들기
 public getAllData(){ //매개변수x
 dept에서 전체 data select => 전체리턴 
 -Collection - rs돌려서 dto에 저장(레코드별) -list저장 - list를 호출한곳으로 반환


}
*/



















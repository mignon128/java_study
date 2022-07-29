package com.varxyz.banking.domain.customer;

import java.util.Collection;
//import java.util.List;

/*
 * CustomerService : Customer에 대한 서비스를 처리하는 클래스
 * 1. 주요 메서드
 *   .addCustomer() : 신규 고객추가
 *   .getCustomerBySsn : 주민번호 고객 조회
 *   .getAllCustomers() : 전체 고객 목록
 *   .getNumberOfCustomers() : 전체 고객 수
 * 2. 기타
 *    - CustomerService는 고객의 정보를 보거나 할 수 있는 속성을 유지해야 한다.
 *    - 고객의 정보를 유지할 수 있는 속성을 정의하라.   
 */

/*
 * 특정 고객에 한정되어 있지 않고 똑같이 행동하기 때문에
 * 서비스는 하나만 필요
 * */

public interface CustomerService {
	 void addCustomer(Customer customer);
	 Customer getCustomerBySsn(String ssn);
//	 List<Customer> getAllCustomers();
	 Collection<Customer> getAllCustomers();
	 int getNumOfCustomers();
}

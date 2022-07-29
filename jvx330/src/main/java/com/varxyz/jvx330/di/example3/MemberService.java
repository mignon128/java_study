package com.varxyz.jvx330.di.example3;

import java.util.List;

public class MemberService {
	private MemberDao menberDao;
	
	public MemberService(MemberDao memberDao) {
		this.menberDao = memberDao;
	}
	
	public List<Member> getAllMember(){
		return menberDao.findAllMember();
	}
}

package com.kh.mybatis.member.model.service;

import com.kh.mybatis.member.model.vo.Member;

public interface MemberService {
	//인터페이스: 추상메소드(public abstract) + 상수필드(public static final)
	
	public abstract int insertMember(Member m);
	int updateMember(Member m); //public abstract 생략한 것임
	int deleteMember(Member m);
	Member loginMember(Member m);
	
}

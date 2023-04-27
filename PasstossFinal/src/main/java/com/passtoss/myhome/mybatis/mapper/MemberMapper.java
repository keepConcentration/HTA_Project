package com.passtoss.myhome.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.passtoss.myhome.domain.Company;
import com.passtoss.myhome.domain.MailAuth;
import com.passtoss.myhome.domain.Member;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface MemberMapper {

	Member isId(String id);
	
	MailAuth isMailAuth(Map<String, String> map);
	
	int insertMailAuth(Map<String, String> map);

	int updateMailAuth(Map<String, String> map);

	int createCompany(Company c);

	int insertUser(Member m);

	Company checkURL(String url);

	int resetPassword(String id, String password);

	List<Map<String, Object>> getSearchMemberList(String searchword, List<String> persons);

	int updateProfileImg(String id, String newName);

	int updateProfile(Member m);

	Company getCompanyInfo(int company_id);

	List<Object> getCompanyAllID(int companyId);

}

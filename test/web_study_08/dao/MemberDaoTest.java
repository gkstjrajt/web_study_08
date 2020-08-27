package web_study_08.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import web_study_08.dao.impl.MemberDaoImpl;
import web_study_08.dto.Member;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MemberDaoTest {
	private MemberDao dao = MemberDaoImpl.getInstance();

	@Test
	public void testSelectMemberByAll() {
		System.out.println("testSelectMemberByAll");
		List<Member> list = dao.selectMemberByAll();
		Assert.assertNotNull(list);
		list.stream().forEach(System.out::println);
	}

	@Test
	public void testSelectMemberByNo() {
		System.out.println("testSelectMemberByNo");
		Member member = dao.selectMemberByNo(new Member("somi"));
		Assert.assertNotNull(member);
		System.out.println(member);
	}

	@Test
	public void test01InsertMember() {
		System.out.println("test01InsertMember");
		Member newMember = new Member("박규영", "parkgy", "1234", "pgy@gmail.com", "010-1111-2222", 0);
		int res = dao.insertMember(newMember);
		Assert.assertEquals(1, res);
		System.out.println(newMember);
		
	}

	@Test
	public void test02UpdateMember() {
		System.out.println("test02UpdateMember");
		Member updateMember = new Member("문채원", "parkgy", "5678", "mcw@gmail.com", "010-3333-5555", 1);
		int res = dao.updateMember(updateMember);
		Assert.assertEquals(1, res);
		System.out.println(updateMember);
	}

	@Test
	public void test03DeleteMember() {
		System.out.println("test03DeleteMember");
		Member deleteMember = new Member("parkgy");
		int res = dao.deleteMember(deleteMember);
		Assert.assertEquals(1, res);
		System.out.println("삭제완료~");
	}

}

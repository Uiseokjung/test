package db;

public class MemberVO {
	int seq;
	String id;
	String name;
	
	public int getMemberSeq() {
		return seq;
	}
	
	public String getMemberId() {
		return id;
	}
	
	public String getMemberName() {
		return name;
	}
	
	public void setMemberSeq(int seq) {
		this.seq = seq;
	}
	
	public void setMemberId(String id) {
		this.id = id;
	}
	
	public void setMemberName(String name) {
		this.name = name;
	}

	public void setMember(int seq, String id, String name) {
		setMemberSeq(seq);
		setMemberId(id);
		setMemberName(name);
	}
}

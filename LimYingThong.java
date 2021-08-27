package test;

public class Member {
    private String memberId;
    private String name;
    private int membersduration;
    private static int numOfMembers=0;
/**
   use Member.numOfMembers for better visibility
    */
    public Member() {
        this.numOfMembers++;
    }

    public Member(String memberId, String name, int membersduration) {
        this.memberId = memberId;
        this.name = name;
        this.membershipDuration = membersduration;
        this.noOfMembers = noOfMembers;
        /**
   use Member.numOfMembers for better visibility
    */
        this.numOfMembers++;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMembersduration() {
        return membersduration;
    }

    public void setMembersduration(int membersduration) {
        this.membersduration = membersduration;
    }
/**
   static variable should access by static method
    */
    public int getNumOfMembers() {
        return numOfMembers;
    }
/**
   static variable should access by static method
    */
    public void setNumOfMembers(int numOfMembers) {
        this.numOfMembers = numOfMembers;
    }

    public double calculateMemberFees(){
        return this.membersduration*100;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                ", membershipDuration=" + membersduration +
                ", numOfMembers=" + numOfMembers +
                '}';
    }
}



public class driver {
    public static void main(String[] args) {
/**
   Where is your second member
    */
        Member m1 = new Member("S001", "Lim Ying Thong", 2);
        System.out.println(m2.toString());

    }
}
public class Member {
    private String memberId;
    private String name;
    private int membershipDuration;
    private static int noOfMembers;

    /**
   Where is your no args constructor
    */

    public Member(String memberId, String name, int membershipDuration) {
        this.memberId = memberId;
        this.name = name;
        this.membershipDuration = membershipDuration;
	    this.noOfMembers++;
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

    public int getMembershipDuration() {
        return membershipDuration;
    }

    public void setMembershipDuration(int membershipDuration) {
        this.membershipDuration = membershipDuration;
    }
/**
   static variable should access by static method
    */
    public int getNoOfMembers() {
        return noOfMembers;
    }
/**
   static variable should access by static method
    */
    public void setNoOfMembers(int noOfMembers) {
        this.noOfMembers = noOfMembers;
    }

    public double calculateMemberFees(){
        return this.membershipDuration * 100;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                ", membershipDuration=" + membershipDuration +
                ", noOfMembers=" + noOfMembers +
                '}';
    }

    public class Main {   
 	public static void main(String[] args) {
         /**
   Next time use different variable naming 
    */
       	Member m1 = new Member("20WDM0659", "KerwinSoo", 1);
	    System.out.println(m1);

	    Member m1 = new Member("20WDM04121", "Bob", 1);
	    System.out.println(m1);

    }
}
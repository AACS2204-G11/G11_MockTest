public class Member {
    private String memberId;
    private String name;
    private int membershipDuration;
    private int noOfMembers;

    public Member() {
    }

    public Member(String memberId, String name, int membershipDuration, int noOfMembers) {
        this.memberId = memberId;
        this.name = name;
        this.membershipDuration = membershipDuration;
        this.noOfMembers = noOfMembers;

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

    public int getNoOfMembers() {
        return noOfMembers;
    }

    public void setNoOfMembers(int noOfMembers) {
        this.noOfMembers = noOfMembers;
    }

    public double calculateMemberFees(){
        return this.membershipDuration * 100; //need do again
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

    public static void main(String[] args) {
        Member m1 = new Member();
        m1.setMemberId("A1");
        m1.setName("SS");
        m1.setMembershipDuration(3);
        m1.setNoOfMembers(4);

        System.out.println( "Member ID = " + m1.getMemberId() +"\n"+
                            "Name =" + m1.getName() +"\n"+
                            "Member duration ="+ m1.getMembershipDuration()+"\n"+
                            "No of members =" + m1.getNoOfMembers());

        Member m2 = new Member("A2", "SY", 2, 7);

        System.out.println();
    }
}
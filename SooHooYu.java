public class Member {
    private String memberId;
    private String name;
    private int membershipDuration;
    private static int noOfMembers = 0;

    public Member() {
        this.noOfMembers++;
    }

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

    public int getNoOfMembers() {
        return noOfMembers;
    }

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

    public static void main(String[] args) {
        Member m1 = new Member();
        m1.setMemberId("3423M2M3");
        m1.setName("Ali");
        m1.setMembershipDuration(3);

        Member m2 = new Member();
        m2.setMemberId("232N321");
        m2.setName("Abu");
        m2.setMembershipDuration(4);


        System.out.println(m1.toString());
        System.out.println(m2.toString());

    }
}
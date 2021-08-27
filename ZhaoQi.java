package test;

public class member {
    private String memberId;
    private String name;
    private int membershipDuration;
    private static int noOfMembers;

   public student() {
        this.noOfMembers++;
    }

    public member(String memberId, String name, int membershipDuration) {
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

    public static int getNoOfMembers() {
        return noOfMembers;
    }

    public static void setNoOfMembers(int noOfMembers) {
        member.noOfMembers = noOfMembers;
    }

    public double calculateMemberFees() {
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
       member m = new member();
        m.setMemberId("20WDM04231");
        m.setName("MokZhaoQi");
        m.setMembershipDuration(2);

        member m2 = new member("20WDM04244", "LonJunJi", 2);
        System.out.println(m);
        System.out.println(m2);
    }
}

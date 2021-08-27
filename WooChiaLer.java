package test;

public class student {
    private String memberId;
    private String name;
    private int membershipDuration;
    private static int noOfMembers=0;

    public student() {
        this.noOfMembers++;
    }

    public student(String memberId, String name, int membershipDuration) {
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
        return this.membershipDuration*100;
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
        Member member = new Member("20WDM04387","WOO",1);
        System.out.println(member);

}
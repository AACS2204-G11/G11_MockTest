package test;

public class ChongKerSiuMember {
    private String memberId;
    private String name;
    private int membershipDuration;
    private static int noOfMembers=0;

    public ChongKerSiuMember() {
        /**
   use ChongKerSiuMember.noOfMembers for better visibility
    */
        this.noOfMembers++;
    }

    public ChongKerSiuMember(String memberId, String name, int membershipDuration) {
        this.memberId = memberId;
        this.name = name;
        this.membershipDuration = membershipDuration;
        /**where is your  noOfMembers since you don't have noOfMembers input args*/
        this.noOfMembers = noOfMembers;
             /**
   use ChongKerSiuMember.noOfMembers for better visibility
    */
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
}
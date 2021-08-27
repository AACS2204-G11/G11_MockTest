import java.util.Scanner;

public class member {
    private String memberId,name;
    private int membershipDuration;
    private static int noOfMembers;

    member(String memberID,String name,int membershipDuration){
        this.memberId=memberID;
        this.name=name;
        this.membershipDuration=membershipDuration;
        noOfMembers++;
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

    public static int getNumOfMember() {
        return noOfMembers;
    }

    public static void setNumOfMember(int noOfMembers) {
        Member.noOfMembers = noOfMembers;
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

    public class Main {
        public static void main(String[] args) {
            Member m1 = new Member("20WDM04244", "LonJunJi", 1);
            System.out.println(m1);
        }
    }
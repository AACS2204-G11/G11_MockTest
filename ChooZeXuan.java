import java.util.Scanner;

public class Member {
    private static int membershipDuration = 0;
    private String memberId;
    private String name;
    private int noOfMembers;

    public Member(String memberId, String name, int noOfMembers) {
        this.memberId = memberId;
        this.name = name;
        this.noOfMembers = noOfMembers;
        membershipDuration =+1;
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

    public static double calculateInterest(){
        return Member.membershipDuration* 100;
    }

    @Override
    public String toString() {
        return "Member ID='" + memberId + '\'' +
                ", Name =" + name +
                ", Number of Members=" + noOfMembers +
                ", Membership Duration=" + membershipDuration +
                '}';
    }

    public static void main(String[] args) {
        Member m = new Member("M001" , "ChooZeXuan", 5);
        m.setMembershipDuration(5);
        System.out.println(Member.calculateInterest());
    }

}
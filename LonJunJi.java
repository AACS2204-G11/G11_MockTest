import java.util.Scanner;

public class member {
    private String memberId,name;
    private int membershipDuration;
    private static int noOfMembers;

/**constructor declare public better */
    member(String memberID,String name,int membershipDuration){
        this.memberId=memberID;
        this.name=name;
        this.membershipDuration=membershipDuration;
        /**
   use Member.numOfMembers for better visibility
    */
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
    /**
   static variable should access by static method
    */

    public static int getNumOfMember() {
        return noOfMembers;
    }
/**
   static variable should access by static method
    */
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
            /**
   Where is your second member
    */
            Member m1 = new Member("20WDM04244", "LonJunJi", 1);
            System.out.println(m1);
        }
    }
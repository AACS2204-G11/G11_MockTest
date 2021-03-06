public class Member {
    private String memberId;
    private String name;
    private int membershipDuration;
    /**noOfMembers should declared as static */
    private int noOfMember;

    public Member(){
        /**
   use Member.numOfMembers for better visibility
    */
        this.noOfMember++;
    }

    public Member(String memberId, String name, int membershipDuration) {
        this.memberId = memberId;
        this.name = name;
        this.membershipDuration = membershipDuration;
        /**need to increment the noOfMember variable */
    }

    public String getMemberId(String memberId) {
        this.memberId = memberId;
    }
    public String getName(String name){
        this.name= name;
    }
    public int getMembershipDuration(int membershipDuration){
        this.membershipDuration = membershipDuration;
    }
    public int getNoOfMember(int NoOfMember){
        this.noOfMember = NoOfMember;
    }
    public double calculateMemberFees(){
        return this.membershipDuration * 100;
    }
/**
No mutator and getter for certain variable
 */
    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                ", membershipDuration=" + membershipDuration +
                ", noOfMembers=" + noOfMember +
                '}';
    }

    public static void main(String[] args) {
        Member member1 = new Member();
        member1.getMemberId("A1001");
        member1.getName("YeeYao");
        member1.getMembershipDuration(7);
        member1.getNoOfMember(4);

        /**Can use print the variable only */
        System.out.println( "Member ID: " + member1.getMemberId() +"\n"+
                "Name: " + member1.getName() +"\n"+
                "Member duration: "+ member1.getMembershipDuration()+"\n"+
                "No of members: " + member1.getNoOfMember());

        Member member2 = new Member("B1002", "ChiaLer", 3, 3);
/**What you want to print leh */
        System.out.println();
    }
}


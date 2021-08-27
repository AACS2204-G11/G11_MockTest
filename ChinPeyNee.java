import java.lang.reflect.Member;

public class member {
    private String memberId;
    private String name;
    private int membershipDuration;
    private int noOfMembers = 0;

    public member() {
        this.noOfMembers++;
    }

    public member(String memberId, String name, int membershipDuration, int noOfMembers) {
        this.memberId = memberId;
        this.name = name;
        this.membershipDuration = membershipDuration;
        this.noOfMembers = noOfMembers;
        this.noOfMembers++;
    }

    public String getMemberId () {
        return memberId;
    }
    public void setMemberId (String memberId) {
        this.memberId = memberId;
    }

    public String GetName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getMembershipDuration () {
        return membershipDuration;
    }

    public void setMembershipDuration (int membershipDuration) {
        this.membershipDuration = membershipDuration;
    }

    public int getNoOfMembers() {
        return noOfMembers;
    }

    public void setNoOfMembers (int noOfMembers) {
        this.noOfMembers = noOfMembers;
    }

    public double calculateMemberFee() {
        return this.membershipDuration*100;
    }

    @Override
    public String toString() {
        return "Member ID = '" + memberId + '\'' +
                ", Name = '" + name + '\'' +
                ", Member Ship Duration = " + membershipDuration +
                ", No Of Members = " + noOfMembers;
    }

    public static void main(String[] args) {
        Member member1 = new Member("A001", "Chin Pey Nee", 1);
        Member member2 = new Member("A002", "Pey Nee", 3);

        System.out.println(member1, toString());
        System.out.println(member2, toString());
    }
}

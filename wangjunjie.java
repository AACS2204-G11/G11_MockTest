package member;

class member{
    private String memberID;
    private String name;
    Private int membershipDuration;
    Private int noOfMembers;
    Private double  calculateMemberFees;

    public member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;

    }

    public String getmemberID() {
        return memberId;
    }

    public void getmemberID(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



public class member{

    public static void main(String[] args) {
        member m = new member("B111","WANG JUN JIE");
        System.out.println(m.toString());

    }
}
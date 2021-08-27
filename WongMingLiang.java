public class Member {

 private String memberId;
 private String name;
 private int membershipDuration;
 /**noOfMembers should declared as static */
 private int noOfMembers;

 public Member(String memberId, String name, int membershipDuration, int noOfMembers) {
  this.memberId = memberId;
  this.name = name;
  this.membershipDuration = membershipDuration;
  /**No need to assign the noOfMembers */
  this.noOfMembers = noOfMembers;
  noOfMembers += 1;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getId() {
  return memberId;
 }

 public void setId(String memberId) {
  this.memberId = memberId;
 }

 public int getMembershipDuration() {
  return membershipDuration;
 }

 public void setMembershipDuration(int number) {
  this.membershipDuration = number;
 }

 public String toString() {
  return "Member ID: " + memberId + "\n" + "Name: " + name + "\n" + "Membership Duration: " + membershipDuration;
 }

/**
No mutator and getter for certain variable
 */
 public double calculateMemberFee() {
  double memberFees;
  return memberFees = membershipDuration * 100;
 }

 public static void main(String[] args) {
     /**Need to declare two variable */
  Member a1 = new Member("Katie", "123444", 1, 0);
  a1.setName("Katie");
  a1.setId("123444");
  a1.setMembershipDuration(1);
  System.out.println(a1.toString());
 }

}
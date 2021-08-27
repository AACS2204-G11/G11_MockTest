public class Member {
        private String memberId;
        private String name;
        private int membershipDuration;
        private int noOfMembers = 0;

        public Member(String memberId,String name, int membershipDuration, int noOfMembers) {
            this.memberId = memberId;
            this.name = name;
            this.membershipDuration = membershipDuration;
            this.noOfMembers++;
        }

        public String getMemberID() {
            return memberId;
        }
        public void setMemberID(String memberId) {
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
            return membershipDuration * 100;
        }

        public String toString(){
            return "Member ID : " + memberId + "\n" +
                    "Member Name : " + name + "\n" +
                    "Membership duration : " + membershipDuration + "\n" +
                    "No of members : " + noOfMembers;
        }

        public static void main(String[] args) {
            Member m1 = new Member("ABC001", "Oon Cheng Xian", 3,6);
            Member m2 = new Member("ABC002", "Tan Ah Kau", 2,4);

            System.out.println("Member ID : " + m1.getMemberID() + "\n" +
                    "Member Name : " + m1.getName() + "\n" +
                    "Membership duration : " + m1.getMembershipDuration() + "\n" +
                    "Member ID : " + m1.getNoOfMembers() + "\n");

            System.out.println("Member ID : " + m2.getMemberID() + "\n" +
                    "Member Name : " + m2.getName() + "\n" +
                    "Membership duration : " + m2.getMembershipDuration() + "\n" +
                    "Member ID : " + m2.getNoOfMembers() + "\n");
        }

    }
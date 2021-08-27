class Member {
    /**
   noOfMember should be static
    */
    private String memberID,name; private int membershipDuration,noOfMembers;
/**
   Where is your no args constructor
    */
    Member(String memberID,String name,int membershipDuration){
        this.memberID=memberID;
        this.name=name;
        this.membershipDuration=membershipDuration;
        /**
   Since static use Member.noOfMembers better
    */
        this.noOfMembers++;
    }
    public String getid() {
        return memberID;
    }
    public void setid(String memberId) {
        this.memberID = memberID;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public int getduration() {
        return membershipDuration;
    }

    public void setMembershipDuration(int membershipDuration) {
        this.membershipDuration = membershipDuration;
    }

    public int getnumofmem() {
        return noOfMembers;
    }

    /**
   static variable should access by static method
    */
    public void setnumofmem(int noOfMembers) {
        this.noOfMembers = noOfMembers;
    }
    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberID + '\'' +
                ", name='" + name + '\'' +
                ", membershipDuration=" + membershipDuration +
                ", noOfMembers=" + noOfMembers +
                '}';
    }
    public double calculateMemberFees(){
        return this.membershipDuration*100;
    }
    public void calculateMemberfee(int Duration){
        double calculateMeberfees =  Duration * 100;
    }
    public static void main(String[] args) {
        /**
   Need to declare two members
    */
        Member member = new Member("20WDM04238","CHANKARHOU",1);
        System.out.println(member);
    }


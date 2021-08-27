import com.sun.security.jgss.GSSUtil;

/**The class name is member */
public class q1 {
   private String memberId;
   private String name;
   private int membershipDuration;
   private static int noOfMembers = 0;

   public q1() {
       noOfMembers++;
   }

   public q1(String memberId, String name, int membershipDuration) {
       this.memberId = memberId;
       this.name = name;
       this.membershipDuration = membershipDuration;

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
   public int getNoOfMembers() {
       return noOfMembers;
   }

   /**
   static variable should access by static method
    */

   public void setNoOfMembers(int noOfMembers) {
       this.noOfMembers = noOfMembers;
   }

   public double calculateMemberFees() {
       return this.membershipDuration * 100;
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

   class driver{
       public static void main(String[] args) {
           q1 m1 = new q1();
           m1.setMemberId("A101");
           m1.setMembershipDuration(5);
           m1.setName("chan yi feng");
           q1 m2 = new q1("A102", "loo shaw shuen", 6);
           System.out.println(m1);
           System.out.println(m2);
       }

   }


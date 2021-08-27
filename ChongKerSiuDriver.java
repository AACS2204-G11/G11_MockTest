package test;

public class ChongKerSiuDriver {
    public static void main(String[] args) {
        Member m = new Member();
        m.setMemberId("M001");
        m.setName("Chong Ker Siu");
        m.setMembershipDuration(2);

        Member m2 = new Member("M002", "Choo Ze Xuan", 2);
        /**
   Actually no toString also can but up to you.
    */
        System.out.println(m2.toString());
    }
}
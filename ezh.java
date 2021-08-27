public class Member{
	private string memberId;
	private string name;
	private int membershipDuration;
	private int noOfMembers;

public void member (string name,string memberId, int membershipDuration, int noOfMembers){
	this.memberId = memberId;
	this.name = name;
	this.membershipDuration = membershipDuration;
	this.noOfMembers = noOfMembers;

public static calculate memberFees (int membershipDuration){
	double memberFees = double(membershipDuration)* 100;
	return memberFees;
}

public int setMemberId (string memberId){
	this.memberId = memberId;
}

public string get numberId() {
	return memberId;
}

public int setname (string name){
	this name= name;
}

public String get name(){
	return name;
}

public int setmembershipDuration (int membershipDuration){
	this membershipDuration = membershipDuration;
}

public int getmembershipDuration () {
	return membershipDuration;
}

Public int getnoOfMembers(){
	Return noOfMembers;
}

public int SetnoOfMembers (int noOfMembers){
	this.noOfMembers = noOfMembers;
}

@override
public string toString () {
	return string.format(“memberId” +memberId+/n 
Name = “+name+”/n 
membershipDuration”+ membershipDuration
+“MemberFees;” + memberFees; 
+“NoOfMembers:” + noOfMembers);
}

public class Main {
	public static void main(String[] args) {
	Member ml = new Member(“20WDM04191”, “EuZuoHong”, 1);
	System.out.printIn(ml);

	Member ml = new Member(“20WDM02341”,”Ryan”, 1);
	System.out.printIn(ml);
}

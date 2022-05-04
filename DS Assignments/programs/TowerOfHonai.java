import java.util.*;

class TowerOfHonai{
			static void toh(int n,char source,char intermidiate,char destination){
				
				if(n==1)
					System.out.println("Disk from "+source+" to "+destination);
				else{
					toh(n-1,source,destination,intermidiate);
					System.out.println("Disk from "+source+" to "+destination);
					toh(n-1,intermidiate,source,destination);
				}
			}

	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter number for TOH:");
			int n=sc.nextInt();
			
			toh(n,'A','B','C');

}

}
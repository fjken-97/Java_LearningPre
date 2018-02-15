import java.util.Scanner;

public class UseRegularExpression {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		String mail = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		
		System.out.println("请输入你所要核实的信息：1.邮箱地址； 2。大陆手机号码");
		Scanner ch = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int choice = ch.nextInt();
		while(true) {
			if(choice==1) {
				System.out.println("请输入你所要核实的邮箱地址；");
				String checkMail = sc.nextLine();
				System.out.println(checkMail);
				System.out.println(checkMail.matches(mail));
			}
			else if(choice==2){
				System.out.println("请输入你所要核实的大陆手机号码；");
				String regex ="(13[0-9]|15[012356789]|18[056789])\\d{8}";
				String phone = sc.nextLine();
				if(phone.matches(regex)) {
					System.out.println("你输入的手机号属于大陆地区号码");
				}
				else {
					System.out.println("你输入的手机号不属于大陆地区号码");
				}
			}
			else break;
			choice = ch.nextInt();
		}
	sc.close();
	ch.close();
	}
}

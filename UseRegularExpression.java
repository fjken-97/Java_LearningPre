import java.util.Scanner;

public class UseRegularExpression {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		String mail = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		
		System.out.println("����������Ҫ��ʵ����Ϣ��1.�����ַ�� 2����½�ֻ�����");
		Scanner ch = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int choice = ch.nextInt();
		while(true) {
			if(choice==1) {
				System.out.println("����������Ҫ��ʵ�������ַ��");
				String checkMail = sc.nextLine();
				System.out.println(checkMail);
				System.out.println(checkMail.matches(mail));
			}
			else if(choice==2){
				System.out.println("����������Ҫ��ʵ�Ĵ�½�ֻ����룻");
				String regex ="(13[0-9]|15[012356789]|18[056789])\\d{8}";
				String phone = sc.nextLine();
				if(phone.matches(regex)) {
					System.out.println("��������ֻ������ڴ�½��������");
				}
				else {
					System.out.println("��������ֻ��Ų����ڴ�½��������");
				}
			}
			else break;
			choice = ch.nextInt();
		}
	sc.close();
	ch.close();
	}
}

package information_system;

import java.util.Scanner;

public class View {     //view��ͼ��
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		Service ser = new Service();
		boolean flag = false;
			while(true) {
				System.out.println("========��ӭʹ��========");
				System.out.println("[1] ��ѯȫ��ͼ����Ϣ");
				System.out.println("[2] ģ������");
				System.out.println("[3] ɾ��ͼ����Ϣ");
				System.out.println("[4] �˳�ϵͳ");
				System.out.println("�����룺");
				System.out.print("-->");
				int chioce=input.nextInt();
				switch(chioce) {
					case 1:
						ser.selectall();             //�鿴ȫ��ͼ����Ϣ
						break;
					case 2:
						ser.select();
						break;
					case 3:
						ser.delete();                //ɾ��ͼ����Ϣ
						break;
					case 4:
						System.out.println("��ӭ�´ε�½��");          //�˳�
						System.exit(0);
	                    break;
	                default:
	                	System.out.println("��������ȷ������");          //���������������
				}
				System.out.println("======================================");
			}
		}
		
	}


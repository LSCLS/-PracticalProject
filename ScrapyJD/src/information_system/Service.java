package information_system;

import java.util.HashMap;
import java.util.Scanner;

public class Service {       //�˵��� controller���Ʋ�
	Scanner input = new Scanner(System.in);
	DataOperate data_operate = new DataOperate();
	public Service() {          //�޲ι��췽��
    }
	public void selectall() { //�������ݿ��ѯȫ��ͼ����Ϣ����
		data_operate.selectall();
	}
	
	public void select() { //�������ݿ�ģ����ѯ
		System.out.println("��������Ҫ��ѯ����Ϣ:  ");
        String message=input.nextLine();
        data_operate.select(message);
	}
	public void delete() { //�������ݿ�ɾ������
		System.out.println("������ɾ����ͼ��ID��");
        String id=input.nextLine();
        data_operate.delete(id);
	}
	



}
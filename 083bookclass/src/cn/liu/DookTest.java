package cn.liu;

public class DookTest {

	public static void main(String[] args) {
		Book book = new Book("JAVA","���տƼ�",60.0);
        System.out.println("������"+book.getTitle());
        System.out.println("���ߣ�"+book.getAuthor());
        System.out.println("�۸�"+book.getPrice()+"Ԫ");
	}

}

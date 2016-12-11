package cn.liu;

public class DookTest {

	public static void main(String[] args) {
		Book book = new Book("JAVA","明日科技",60.0);
        System.out.println("书名："+book.getTitle());
        System.out.println("作者："+book.getAuthor());
        System.out.println("价格："+book.getPrice()+"元");
	}

}

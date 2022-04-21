package Messenger;

public class Application {
	public static void main(String... args) {
		DbContext db1 = DbContext.getInstance();
		DbContext db2 = DbContext.getInstance();

		System.out.println(db1);
		System.out.println(db2);
		System.out.println(db1 == db2);
	}
}

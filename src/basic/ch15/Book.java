package basic.ch15;

public class Book {

	private int totalPage;
	private String title;
	private String author;
	
	//성성자
	public Book(String title , String author) {
		this.title = title;
		this.author = author;
	}
	
	public Book (String title, String author, int totalPage) {
		this(title ,author);
		this.totalPage = totalPage;
	}
	
	//getter
		public int getTotalPage() {
			return totalPage;
		}
		
		public String getTitle() {
			return title;
		}
		
		public String getAuthor() {
			return author;
		}
		
	}//end of main
	

//end of class}

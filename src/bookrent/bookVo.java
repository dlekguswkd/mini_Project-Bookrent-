package bookrent;

public class bookVo {
	
	//필드
	private int bookId;
	private String title;
	private String author;
	private String pubs;
	private String pubDate;
	private int bStatus;
	
	
	//생성자
	public bookVo() {
		super();
	}
	
	public bookVo(int bookId, String title, String author, String pubs, String pubDate, int bStatus) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.pubs = pubs;
		this.pubDate = pubDate;
		this.bStatus = bStatus;
	}

	// 메소드 gs
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPubs() {
		return pubs;
	}

	public void setPubs(String pubs) {
		this.pubs = pubs;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	public int getbStatus() {
		return bStatus;
	}

	public void setbStatus(int bStatus) {
		this.bStatus = bStatus;
	}

	
	//메소드 일반
	@Override
	public String toString() {
		return "bookVo [bookId=" + bookId + ", title=" + title + ", author=" + author + ", pubs=" + pubs + ", pubDate="
				+ pubDate + ", bStatus=" + bStatus + "]";
	}
	

	

}

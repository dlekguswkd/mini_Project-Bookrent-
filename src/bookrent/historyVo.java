package bookrent;

public class historyVo {
	
	// 필드
	private int historyNum;
	private int bookId;				
	private int userNum;	
	private String rentDate;
	private String returnDate;
	
	//생성자
	public historyVo() {
		super();
	}

	public historyVo(int historyNum, int bookId, int userNum, String rentDate, String returnDate) {
		super();
		this.historyNum = historyNum;
		this.bookId = bookId;
		this.userNum = userNum;
		this.rentDate = rentDate;
		this.returnDate = returnDate;
	}

	
	//메소드 gs
	public int getHistoryNum() {
		return historyNum;
	}

	public void setHistoryNum(int historyNum) {
		this.historyNum = historyNum;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getUserNum() {
		return userNum;
	}

	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}

	public String getRentDate() {
		return rentDate;
	}

	public void setRentDate(String rentDate) {
		this.rentDate = rentDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	
	//메소드 일반
	@Override
	public String toString() {
		return "historyVo [historyNum=" + historyNum + ", bookId=" + bookId + ", userNum=" + userNum + ", rentDate="
				+ rentDate + ", returnDate=" + returnDate + "]";
	}

	
	
}

public class Magazine extends LibraryItem{
    public Magazine(String title, String author, int year, boolean isBorrowed,LibraryItemType itemType, int pageCount) {
        super(title, author, year, isBorrowed, itemType.MAGAZINE);
        this.issueNumber = issueNumber;
    }

    private int issueNumber;

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

//    @Override
//    public String toString() {
//        return "Magazine{" +
//                "issueNumber=" + issueNumber +
//                ", itemType=" + itemType +
//                '}';
//    }
}

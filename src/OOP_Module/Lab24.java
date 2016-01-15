package OOP_Module;

/**
 * Created by Admin on 16.12.2015.
 */
public class Lab24 {
    public static void main(String[] args) {
        //lab24
//        Book book = new Book("TestNameBook", 100, "TestBookAuthor");
//        System.out.println(book.toPrint());

        //lab25
//        Journal journal = new Journal("TestNameBook", 100, "2", "2");
//        System.out.println(journal.toPrint());

        int countPages = 100;

        String testNameIssue = "TestNameIssue";

        String testNameBook = "TestNameBook";
        String testAuthorBook = "TestBookAuthor";

        String testNameJournal = "TestNameJournal";
        String testYearJournal = "TestYearJournal";
        String testNumberJournal = "TestNumberJournal";

        String expectedPrintCatalog = "Issue{name=TestNameIssue,countPages=100}" +
                "Book{name=TestNameBook,countPages=100,author=TestBookAuthor}" +
                "Journal{name=TestNameJournal,countPages=100,year=TestYearJournal,number=TestNumberJournal}";

        Library library = new Library();

        Issue[] arrayIssue = new Issue[3];

        arrayIssue[0] = new Issue(testNameIssue, countPages);
        arrayIssue[1] = new Book(testNameBook, countPages, testAuthorBook);
        arrayIssue[2] = new Journal(testNameJournal, countPages, testYearJournal, testNumberJournal);

        String actualPrintCatalog = library.printCatalog(arrayIssue);
        System.out.println("\n" + expectedPrintCatalog);

        //check
//        if (actualPrintCatalog == null)
//            throw new AssertionError("Result cannot be null");

        if (actualPrintCatalog.equals(expectedPrintCatalog))
            System.out.print("OK");
//        else {
//            throw new AssertionError("Expected " + expectedPrintCatalog + " but found " + actualPrintCatalog);
//        }

    }
}

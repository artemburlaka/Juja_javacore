package OOP_Module;

/**
 * Created by Admin on 16.12.2015.
 */
public class Journal extends Issue {
    private String yearJournal;
    private String numberJournal;

    public Journal(String name, int countPages, String yearJournal, String numberJournal) {
        super(name, countPages);
        this.yearJournal = yearJournal;
        this.numberJournal = numberJournal;
    }
//    public String toPrint() {
//        return "Journal{" + super.toPrint() +
//                ",year=" + yearJournal + ",number=" + numberJournal + "}";
//    }

    @Override
    public String toPrint() {
        return "Journal{" +
                "name=" + getName() +
                ",countPages=" + getCountPages() +
                ",year=" + yearJournal +
                ",number=" + numberJournal +
                "}";
    }

}

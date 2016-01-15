package OOP_Module;

/**
 * Created by Admin on 16.12.2015.
 */
public class Library {
    public static String printCatalog(Issue[] catalog) {
              if (catalog.length == 0){
                  return "";
              }
        else {
                  String s = "";
                  for (int index = 0; index < catalog.length; index++) {

                      s += catalog[index].toPrint();
                  }
                  return s;
              }
    }
    public String getIssueWithCountPagesMoreN(Issue[] catalog, int barrierCountPages) {
        if (catalog.length == 0){
            return "";
        }
        else {
            String s = "";
            for (int index = 0; index < catalog.length; index++) {
                if (catalog[index].getCountPages() > barrierCountPages) {
                    s += catalog[index].toPrint();
                }
            }
            return s;
        }
    }


}

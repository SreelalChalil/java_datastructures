import java.io.File;
import java.io.FileFilter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


/**
 * Here we are going to write some functions to do some disk files clean up
 *
 */
public class CodeExercise {
    List<String> result = new ArrayList<String>();

    public static void main(String[] args) {

        System.out.println("=========Beginning of exercise 0=========");

        // For exercise 0. You will need to fill in the missing class
        // definition.
        ObjectTest();

        Interview interview = new Interview();

        // For exercise 1
        System.out.println("=========Beginning of exercise 1 =========");
        Period[] periods = new Period[3];
        periods[0] = new Period("1/1/2016", "7/1/2016");
        periods[1] = new Period("3/1/2016", "10/1/2016");
        periods[2] = new Period("11/1/2016", "12/1/2016");
        boolean result = interview.hasOverlappedPeriod(periods);
        System.out.println("Periods are overlapping :" + result);

        System.out.println("=========Beginning of exercise 1 =========");
        Period[] periods2 = new Period[3];
        periods2[0] = new Period("1/1/2016", "7/1/2016");
        periods2[1] = new Period("3/1/2017", "10/1/2017");
        periods2[2] = new Period("11/1/2018", "12/1/2018");
        boolean result2 = interview.hasOverlappedPeriod(periods2);
        System.out.println("Periods are overlapping :" + result2);

        ObjectTest();

        // For exercise 2
        //String folderPath = "C:\\Temp";
        // Have changed the path according to my system
        String folderPath = System.getProperty("user.home")+ "/Documents";
        List<String> listResult = interview.findLargeAndSmallFiles(folderPath, 1024 * 50, 10240);
        Iterator<String> files = listResult.iterator();
        while (files.hasNext()) {
            String file = (String) files.next();
            System.out.println(file);
        }
    }

    // Exercise 0
    //
    // Class definitions for Party and Organization are missing and you will
    // need to fill in the class definition.
    //
    // - "Party" is the root class.
    // - "Organization" and "Person" inherit from Party and they should have a data
    // member of 'FullName' either having it themselves or through inheritance.
    // - "Person" should have the data members of 'FirstName', 'LastName' and
    // 'FullName' either having them themselves or through inheritance.
    // - And 'FullName' = 'FirstName' + " " + "LastName"
    // - Example: FirstName = 'John' and LastName = 'Smith', FullName will be
    // 'John Smith'
    //
    // NOTE! NOTE! You have the freedom to design where the data members will be.
    // The above is just some general description for this exercise.
    //
    public static void ObjectTest() {
        Organization org = new Organization("CodeObjects");
        Person person = new Person("John", "Smith");

        ArrayList<Party> partyList = new ArrayList<Party>();
        partyList.add(org);
        partyList.add(person);

        for (Party p : partyList) {
            if (p.getFullName() != null) {
                if (p.getFullName().equals("John Smith")) {
                    System.out.println("John Smith is found");
                    break;
                }
            }
        }
    }

}

/**
 * A simple data structure to present a period. You can safely assume the end is
 * always greater than start
 */
class Period {
    public Date StartDate;
    public Date EndDate;

    public Period(String start, String end) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            this.StartDate = dateFormat.parse(start);
            this.EndDate = dateFormat.parse(end);

            if (this.StartDate.compareTo(this.EndDate) > 0) {
                throw new RuntimeException("The end date must be greater than the start date.");
            }
        } catch (ParseException ex) {
            throw new RuntimeException("Unable to prase the date", ex);
        }
    }
}

class Interview {
    /**
     * Exercise 1 Given a list of period to see if there is any period being
     * overlapped Example: assuming we have the inputs like below Period 1: {
     * "1/1/2016", "7/1/2016" } Period 2: { "3/1/2016", "12/1/2016" } Period 3: {
     * "10/1/2016", "2/1/2017" } Period 4: { "5/1/2016", "6/15/2016" } We can see
     * period 1, 2, 3 and 4 overlap with one another. Then this method should return
     * true.
     */
    public boolean hasOverlappedPeriod(Period[] periods) {
        boolean isOverlapped = false;
        for(int i=0;i< periods.length ;i++){
            for(int j=i+1; j<periods.length; j++){
                if(periods[i].EndDate.compareTo(periods[j].StartDate) >=0
                        && periods[i].StartDate.compareTo(periods[j].EndDate) <0){
                            isOverlapped=true;
                }
            }
        }
        return isOverlapped;
    }

    /**
     * Exercise 2 To search the input folder and its children folders to find any
     * file whose file size is either greater than the asking file size specified in
     * 'largeFileSize' or less than the file size specified in 'smallFileSize'.
     *
     * @return the list of files with the full path
     * @throws Exception
     */
    public List<String> findLargeAndSmallFiles(String searchFolder, long largeFileSize, long smallFileSize) {
        File searchDirecory = new File(searchFolder);
        ArrayList<String> fileList = new ArrayList<>();
        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.length() > largeFileSize || f.length() < smallFileSize;
            }
        };
        File[] files = searchDirecory.listFiles(filter);
        Arrays.stream(files).forEach((f) -> {
            if(f.isDirectory()){
                fileList.addAll(findLargeAndSmallFiles(f.getAbsolutePath(), largeFileSize, smallFileSize));
            }
            else if(f.isFile()){
                fileList.add(f.getAbsolutePath());
            }
        });
        return fileList;
    }
}

class Party {
    public String FullName;

    public String getFullName(){
        return FullName;
    }
}

class Organization extends  Party{
    public Organization(String name){
        this.FullName = name;
    }
}

class Person extends Party{
    public String FirstName, LastName;
    public Person(String firstName, String lastName){
        this.FirstName = firstName;
        this.LastName = lastName;
        this.FullName = this.FirstName + " " + this.LastName;
    }
}
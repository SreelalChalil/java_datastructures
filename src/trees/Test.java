package trees;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Test {
    /**
     * Exercise 1 Given a list of period to see if there is any period being
     * overlapped Example: assuming we have the inputs like below Period 1: {
     * "1/1/2016", "7/1/2016" } Period 2: { "3/1/2016", "12/1/2016" } Period 3: {
     * "10/1/2016", "2/1/2017" } Period 4: { "5/1/2016", "6/15/2016" } We can see
     * period 1, 2, 3 and 4 overlap with one another. Then this method should return
     * true.
     */
    //    public boolean hasOverlappedPeriod(Period[] periods) {
    //        return false;
    //    }

    /**
     * Exercise 2 To search the input folder and its children folders to find any
     * file whose file size is either greater than the asking file size specified in
     * 'largeFileSize' or less than the file size specified in 'smallFileSize'.
     *
     * @return the list of files with the full path
     * @throws Exception
     */
    public static ArrayList<String> findLargeAndSmallFiles(String searchFolder, long largeFileSize, long smallFileSize) {
        File searchDirecory = new File(searchFolder);
        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File f) {
                return true ? f.length() > largeFileSize || f.length() < smallFileSize : false;
            }
        };
        FileFilter folderFilter = new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.isDirectory();
            }
        };

        File[] files = searchDirecory.listFiles(filter);
        ArrayList<String> fileList = new ArrayList<>();
        Arrays.stream(files).forEach((f) -> {
            if(f.isDirectory()){
                fileList.addAll(findLargeAndSmallFiles(f.getAbsolutePath(), largeFileSize, smallFileSize));
            }
            else {
                fileList.add(f.getAbsolutePath());
            }
            System.out.println(f.getAbsolutePath());
        });
        return fileList;

    }

    public static List<String> getAllfiles(String searchFolder, long largeFileSize, long smallFileSize) {
        List<File> fileArrayList = Arrays.stream(new File(searchFolder).listFiles()).toList();
        List<String> filepaths = new ArrayList<String>();
        for (File file : fileArrayList) {
            if (file.isFile() && file.length() > largeFileSize || file.length() < smallFileSize) {
                filepaths.add(file.getAbsolutePath());
            }
            if (file.isDirectory()) {
                return getAllfiles(file.getAbsolutePath(), largeFileSize, smallFileSize);
            }
        }
        return filepaths;
    }
    public  static void main(String[] args) {
        String x = System.getProperty("user.home");
        findLargeAndSmallFiles(x, 10, 2);
    }
}
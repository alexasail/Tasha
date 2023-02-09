import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        DirLister dirLister = new DirLister();
        List<FileEntry> finalFile = dirLister.listDir(Path.of("/Users/aleksefremov/Desktop/photo/for_seting"));
        for (FileEntry fileEntry : finalFile) {
            System.out.println(fileEntry);
        }
    }

}
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DirLister {
    private FileEntry getFileEntry(Path path) throws IOException {
        String s = path.getFileName().toString();
        long size = Files.size(path);
        FileType type = Files.isDirectory(path) ? FileType.DIR_TYPE : FileType.FILE_TYPE;
        return new FileEntry(s,size,type);
    }

    public List<FileEntry> listDir(Path pathEntry) throws IOException {
        if (!Files.exists(pathEntry)) {
            throw new IOException("Передали несуществующий файл");
        }
        if (!Files.isDirectory(pathEntry)) {
            throw new IOException("Передали не папку");
        }
        try {
            List<Path> listing = Files.walk(pathEntry, 1).toList();
            List<FileEntry> arrList = new ArrayList<>();
            for (Path path : listing) {
                arrList.add(getFileEntry(path));
            }
            return arrList;
        } catch (IOException e) {
            throw new IOException("Возникла ошибка при сканировании папки", e);
        }
    }
}

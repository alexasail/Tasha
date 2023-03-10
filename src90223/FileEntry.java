public class FileEntry {
    private final String name;
    private final long size;
    private final FileType type;

    public FileEntry(String name, long size, FileType type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public long getSize() {
        return size;
    }

    public FileType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FileEntry fileEntry = (FileEntry) o;

        if (!name.equals(fileEntry.name)) return false;
        if (size != (fileEntry.size)) return false;
        return type == fileEntry.type;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = (int) (31 * result + size);
        result = 31 * result + type.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FileEntry{");
        sb.append("name='").append(name).append('\'');
        sb.append(", size=").append(size);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}

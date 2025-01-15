import java.util.Objects;

public class ArchiveItem {
    private String name;
    private String identifier;

    public ArchiveItem(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }

    @Override
    public String toString() {
        return identifier +":"+" "+ name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ArchiveItem that = (ArchiveItem) o;
        return Objects.equals(identifier, that.identifier);
    }
}

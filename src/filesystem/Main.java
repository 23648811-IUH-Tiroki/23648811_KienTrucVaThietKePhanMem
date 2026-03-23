package filesystem;

public class Main {
    public static void main(String[] args) {

        // File
        File f1 = new File("a.txt", 10);
        File f2 = new File("b.txt", 20);
        File f3 = new File("c.txt", 30);

        // Folder
        Folder root = new Folder("Root");
        Folder subFolder = new Folder("SubFolder");

        subFolder.add(f3);

        root.add(f1);
        root.add(f2);
        root.add(subFolder);

        // Hiển thị
        root.showDetails("");
    }
}
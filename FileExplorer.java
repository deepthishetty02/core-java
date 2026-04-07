class FileExplorer {
 static void openFolder() {
        System.out.println("Folder opened");
     checkPath("C:/Users");
    }
static void checkPath(String path) {
   System.out.println("Path: " + path);
    int files = getFiles();
     System.out.println("Files: " + files);
    }
static int getFiles() {
        return 15;
}

}


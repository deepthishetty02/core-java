class Pinterest {

    String pinTitle;
    String boardName;
    int likes;

    public Pinterest() {
    }

    
    public Pinterest(String pinTitle, String boardName, int likes) {
        this.pinTitle = pinTitle;
        this.boardName = boardName;
        this.likes = likes;
    }

   
    public void display() {
        System.out.println(pinTitle);
        System.out.println(boardName);
        System.out.println(likes);
        System.out.println("-------------------");
    }
}
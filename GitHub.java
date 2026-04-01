class GitHub {

    String repositoryName;
    String ownerName;
    int stars;

    public GitHub() {
    }

    public GitHub(String repositoryName, String ownerName, int stars) {
        this.repositoryName = repositoryName;
        this.ownerName = ownerName;
        this.stars = stars;
    }

    public void display() {
        System.out.println(repositoryName);
        System.out.println(ownerName);
        System.out.println(stars);
        System.out.println("-------------------");
    }
}
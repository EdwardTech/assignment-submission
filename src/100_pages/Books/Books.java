class Books {
    String title;
    String author;
}

class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];

        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks[0].title = "fruit's Java";
        myBooks[1].title = "Java Gatsby";
        myBooks[2].title = "collection recipes for Java";

        myBooks[0].author = "Bob";
        myBooks[1].author = "Stiv";
        myBooks[2].author = "Yann";
        int x = 0;
        while(x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(", author");
            System.out.print(myBooks[x].author);
            x++;
        }
    }
}

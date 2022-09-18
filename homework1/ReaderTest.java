package homework1;

public class ReaderTest {
    public static void main(String[] args) {

        Reader reader1 = new Reader();
        reader1.name = "Elif";
        reader1.age = 26;
        reader1.gender = 'F';

        Author author = new Author();
        author.name = "Eric From";

        Book book1 = new Book("Name:the Art of Being",180, author , BookType.PYSCHOLOGY , true);
        
        System.out.println(book1.title);


        author.books[0] = book1;


        for (Book book : author.books) {
            if (book != null) {
                System.out.println(book.title);
            }
        }
        reader1.read(book1);
        Reader reader = new Reader();
        reader.name = "Cem";
        reader.age = 28;
        reader.gender = '0';
        reader.setGender('0');
        System.out.println(reader.gender);
    }
}
public class Main {
    public static void main(String[] args) {

        UserLibrary kasutaja1 = new UserLibrary();
        Book raamat1 = new Book("Witcher Book Series", "Robin Murumets", 327, 2004, 4.7);
        Book raamat2 = new Book("Game of Thrones", "Robin Murumets", 578, 2007, 3.7);
        Book raamat3 = new Book("12 Rules For Life", "Jordan Peterson", 217, 2019, 5);
        Book raamat4 = new Book("Homo Deus: The Evolution of Mankind", "Yakuza Narimoto", 432, 2017, 4.3);
        Book raamat5 = new Book("Art Of War", "Sun Zu", 500, 1997, 5);

        kasutaja1.addBook(raamat1);
        kasutaja1.addBook(raamat2);
        kasutaja1.addBook(raamat3);
        kasutaja1.addBook(raamat4);
        kasutaja1.addBook(raamat5);

        kasutaja1.showBooks();
        kasutaja1.removeBook(raamat1);
        kasutaja1.removeBook(raamat3);
        kasutaja1.removeBook(raamat1);
    }
}

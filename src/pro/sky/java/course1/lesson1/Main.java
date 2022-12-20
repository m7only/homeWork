package pro.sky.java.course1.lesson1;

public class Main {
    public static void main(String[] args) {
        Author authorOfSteel = new Author("Николай", "Островский");
        Author authorOfLand = new Author("Михаил", "Шолохов");
        Author authorOfLand2 = new Author("Михаил", "Шолохов");
        Book steel = new Book("Как закалялась сталь", authorOfSteel, 1932);
        Book land = new Book("Поднятая целина", authorOfLand, 1932);
        land.setPublishedYear(1959);
    }
}

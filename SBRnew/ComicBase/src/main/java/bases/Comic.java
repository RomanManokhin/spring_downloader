package bases;

import java.io.Serializable;
import java.time.LocalDate;

public class Comic implements Serializable {

    private String nameComic; //название комикса
    private String nameAuthor; //имя автора
    private int numberOfPages; //количество страниц
    private String genre; //жанр
    private LocalDate yearOfPublishing; //год публикации
    private int costPrice; //базовая цена
    private double priceForSale; //цена продажи
    private String comicSeries; //продолжение?
    private int numberOfComic; //количество комиксов в наличии

    public Comic(String nameComic, String nameAuthor, int numberOfPages, String genre, LocalDate yearOfPublishing,
                 int costPrice, double priceForSale, String comicSeries, int numberOfComic) {
        this.nameComic = nameComic;
        this.nameAuthor = nameAuthor;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        this.yearOfPublishing = yearOfPublishing;
        this.costPrice = costPrice;
        this.priceForSale = priceForSale;
        this.comicSeries = comicSeries;
        this.numberOfComic = numberOfComic;
    }


    public String getNameComic() {
        return nameComic;
    }

    public void setNameComic(String nameComic) {
        this.nameComic = nameComic;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDate getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(LocalDate yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }

    public double getPriceForSale() {
        return priceForSale;
    }

    public void setPriceForSale(double priceForSale) {
        this.priceForSale = priceForSale;
    }

    public String getComicSeries() {
        return comicSeries;
    }

    public void setComicSeries(String comicSeries) {
        this.comicSeries = comicSeries;
    }

    public int getNumberOfComic() {
        return numberOfComic;
    }

    public void setNumberOfComic(int numberOfComic) {
        this.numberOfComic = numberOfComic;
    }

    @Override
    public String toString() {
        return
                "Название комикса -'" + nameComic + '\'' +
                ", имя автора -'" + nameAuthor + '\'' +
                ", страницы -" + numberOfPages +
                ", жанр -'" + genre + '\'' +
                ", год выпуска -" + yearOfPublishing +
                ", себестоимость -" + costPrice +
                ", цена продажи -" + priceForSale +
                ", вселенная -'" + comicSeries + '\'' +
                ", количество экземпрляров -'" + numberOfComic +
                 "\n";
    }


}

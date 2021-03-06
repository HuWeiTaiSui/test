package com.hu.bean;

/**
 * @program: spring
 * @description:
 * @author: hu
 * @create: 2020-02-11 15:03
 */
public class Book {
  private String bookName;
  private String author;

  @Override
  public String toString() {
    return "Book{" + "bookName='" + bookName + '\'' + ", author='" + author + '\'' + '}';
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }
}

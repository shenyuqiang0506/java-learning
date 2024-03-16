package com.shen.mapper;

import com.shen.entity.Book;
import com.shen.entity.Borrow;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author 申宇强
 * @Date 2024/3/16 16:05
 */
public interface BookMapper {
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "sid", property = "sid"),
            @Result(column = "bid", property = "bid"),
            @Result(column = "time", property = "time"),
            @Result(column = "name", property = "studentName"),
            @Result(column = "title", property = "bookName")
    })
    @Select("""
            select * from borrow left join student on borrow.sid = student.id
             left join book on book.id = borrow.bid
            """)
    List<Borrow> getBorrowList();

    @Insert("insert into borrow(sid, bid, time) values(#{sid}, #{bid}, NOW())")
    void addBorrow(@Param("sid") int sid, @Param("bid") int bid);

    @Delete("delete from borrow where id = #{id}")
    void deleteBorrow(String id);

    @Select("select * from book")
    List<Book> getBookList();

    @Delete("delete from book where id = #{id}")
    void deleteBook(int id);

    @Insert("insert into book(title, author, price) values(#{title}, #{author}, #{price})")
    void addBook(@Param("title") String title, @Param("author") String author, @Param("price") double price);

}

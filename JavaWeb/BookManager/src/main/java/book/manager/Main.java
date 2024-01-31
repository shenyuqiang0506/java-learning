package book.manager;

import book.manager.entity.Book;
import book.manager.entity.Student;
import book.manager.sql.SqlUtil;
import lombok.extern.java.Log;
import org.apache.ibatis.io.Resources;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.LogManager;

/**
 * @Author 申宇强
 * @Date 2024/1/31 15:24
 */
@Log
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            LogManager manager = LogManager.getLogManager();
            manager.readConfiguration(Resources.getResourceAsStream("logging.properties"));
            while (true) {
                System.out.println("============================");
                System.out.println("1.录入学生信息");
                System.out.println("2.录入书籍信息");
                System.out.println("3.添加借阅信息");
                System.out.println("4.查询借阅信息");
                System.out.println("5.查询学生信息");
                System.out.println("6.查询书籍信息");
                System.out.print("输入你想要执行的操作(输入其他任意数字退出):");
                int input;
                try {
                    input = scanner.nextInt();

                } catch (Exception e) {
                    return;
                }
                scanner.nextLine();
                switch (input) {
                    case 1:
                        addStudent(scanner);
                        break;
                    case 2:
                        addBook(scanner);
                        break;
                    case 3:
                        addBorrow(scanner);
                        break;
                    case 4:
                        showBorrow();
                        break;
                    case 5:
                        showStudent();
                        break;
                    case 6:
                        showBook();
                        break;
                    default:
                        return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //添加学生信息
    private static void addStudent(Scanner scanner) {
        System.out.print("请输入学生名字:");
        String name = scanner.nextLine();
        System.out.print("请输入学生性别(男/女):");
        String sex = scanner.nextLine();
        System.out.print("请输入学生年级:");
        String grande = scanner.nextLine();
        int g = Integer.parseInt(grande);
        Student student = new Student(name, sex, g);
        SqlUtil.doSqlWork(mapper -> {
            int i = mapper.addStudent(student);
            if (i > 0) {
                System.out.println("学生信息录入成功");
                log.info("插入了学生信息:" + student);
            } else {
                System.out.println("学生信息录入失败");
            }
        });
    }

    //添加书籍信息
    private static void addBook(Scanner scanner) {
        System.out.print("请输入书籍标题:");
        String title = scanner.nextLine();
        System.out.print("请输入书籍介绍:");
        String desc = scanner.nextLine();
        System.out.print("请输入书籍价格:");
        String price = scanner.nextLine();
        double p = Double.parseDouble(price);
        Book book = new Book(title, desc, p);
        SqlUtil.doSqlWork(mapper -> {
            int i = mapper.addBook(book);
            if (i > 0) {
                System.out.println("书籍信息录入成功");
                log.info("插入了书籍信息:" + book);
            } else {
                System.out.println("书籍信息录入失败");
            }
        });
    }

    //添加借阅信息
    private static void addBorrow(Scanner scanner) {
        System.out.print("请输入书籍号:");
        String a = scanner.nextLine();
        int bid = Integer.parseInt(a);
        System.out.print("请输入学生号:");
        String b = scanner.nextLine();
        int sid = Integer.parseInt(b);
        SqlUtil.doSqlWork(mapper -> {
            int i = mapper.addBorrow(sid, bid);
            if (i > 0) {
                System.out.println("借阅信息录入成功");
            } else {
                System.out.println("借阅信息录入失败");
            }
        });
    }

    //查询借阅信息
    private static void showBorrow() {
        SqlUtil.doSqlWork(mapper -> {
            mapper.getBorrowList().forEach(borrow -> {
                System.out.println(borrow.getStudent().getName() + "借了" + borrow.getBook().getTitle());
            });
        });
    }
//    查询学生信息
    private static void showStudent() {
        SqlUtil.doSqlWork(mapper -> {
            mapper.getStudentList().forEach(student -> {
                System.out.println(student.getSid() + "姓名:" + student.getName() + "性别:" + student.getSex() + student.getGrade() + "级");
            });
        });

    }
//    查询书籍信息
    private static void showBook() {
        SqlUtil.doSqlWork(mapper -> {
            mapper.getBookList().forEach(book -> {
                System.out.println(book.getBid() + book.getTitle() + "[售价为:" + book.getPrice() + "]" + "(介绍:" + book.getDesc() + ")");
            });
        });

    }
}

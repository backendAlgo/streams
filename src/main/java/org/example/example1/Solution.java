package org.example.example1;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.function.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.408789797));
        books.add(new Book("The Notebook", "Nicholas Sparks", "Romance", 4.10));
        books.add(new Book("Horror Cocktail", "Robert Bloch", "Horror", 2.67));
        books.add(new Book("House of Leaves", "Mark Z. Danielewski", "Horror", 4.10908908));



//        //TODO: select all books where genre 'horror' and  higher than 3
//        List<Book> answer = new ArrayList<>();
//        for (Book book : books) {
//            if (book.getGenre().equalsIgnoreCase("horror")
//                    && book.getRating() > 3) {
//                answer.add(book);
//            }
//        }
//
//        System.out.println(answer);
//        List<Book> answer2 = books.stream()
//                .filter(book -> book.getGenre().equalsIgnoreCase("horror"))
//                .filter(book -> book.getRating() > 3)
//                .map((book) -> {
//                    book.setRating(prettify(book.getRating()));
//                    return book;
//                })
//                .collect(ArrayList::new,
//                        ArrayList::add,
//                        ArrayList::addAll
//                        );
//        List<Book> answer3 = books.stream()
//                .filter(book -> book.getGenre().equalsIgnoreCase("horror"))
//                .filter(book -> book.getRating() > 3)
//                .collect(Collectors.toList());
//        System.out.println(answer2);
        List<Employee> employees = List.of(
                new Employee("Aziz", 500),
                new Employee("Temur", 550),
                new Employee("Shoxrux", 200),
                new Employee("Xurshid", 1600),
                new Employee("Farruh", 2000)
        );
//        Double sumOfSalaries = employees.stream()
//                .mapToDouble(employee -> employee.getSalary())
//                .sum();
//        List<Book> books1 = new ArrayList<>(books);
//        Stream<Book> bookStream = books1.stream();
//        List<String> authors = bookStream
//                .map(book -> book.getAuthor())
//                .collect(Collectors.toList());
//
//        Stream<Book> bookStream2 = books1.stream();
//        Set<String> genres = bookStream2.map(book -> book.getGenre())
//                .collect(Collectors.toSet());
//        var stream = Stream.iterate(0, i -> i + 1)
//                .peek((num) -> System.out.println("print 66 line"));
//        System.out.println("print 68 line");
//        System.out.println("print");
//
//        stream.collect(Collectors.toList());
//        Double minSalary = employees.stream()
//                .map(employee -> employee.getSalary())
//                .reduce(Double.MAX_VALUE, Double::min, Double::min);
//        System.out.println(minSalary);

        DoubleStream salaryStream = employees.stream()
                .mapToDouble(employee -> employee.getSalary());
        DoubleSummaryStatistics min = salaryStream.summaryStatistics();
        System.out.println(min);

//        System.out.println(sumOfSalaries);
//        long startTime;
//        long endTime;
//
//        List<Employee> list = new ArrayList<>();
//
//        for (int i = 0; i < 100; i++) {
//            list.add(new Employee("John", 20000));
//            list.add(new Employee("Rohn", 3000));
//            list.add(new Employee("Tom", 15000));
//            list.add(new Employee("Bheem", 8000));
//            list.add(new Employee("Shiva", 200));
//            list.add(new Employee("Krishna", 50000));
//        }
//
//
//        startTime = System.currentTimeMillis();
//        System.out.println("Performing Sequentially: "+list.stream()
//                .filter(e -> e.getSalary()> 1000)
//                .count());
//
//        endTime = System.currentTimeMillis();
//
//        System.out.println("Time taken with Sequential : "+(endTime - startTime));
//
//        startTime = System.currentTimeMillis();
//        System.out.println("Performing parallely: "+list.parallelStream()
//                .filter(e -> e.getSalary()> 1000)
//                .count());
//
//        endTime = System.currentTimeMillis();
//
//        System.out.println("Time taken with parallel : "+(endTime - startTime));

    }
    private static Double prettify(Double num) {
        String format = String.format("%.02f", num);
        return Double.valueOf(format);
    }
}

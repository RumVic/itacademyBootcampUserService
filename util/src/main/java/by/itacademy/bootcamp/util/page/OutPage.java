package by.itacademy.bootcamp.page;

import java.util.List;

public class OutPage<ENTITY> {

    private int number;
    private int size;
    private int totalPages;
    private int totalElements;
    private boolean first;
    private int numberOfElements;
    private boolean last;

    private List<ENTITY> content;

    public OutPage(int number,
                   int size,
                   int totalPages,
                   int totalElements,
                   boolean first,
                   int numberOfElements,
                   boolean last,
                   List<ENTITY> content) {
        this.number = number;
        this.size = size;
        this.totalPages = totalPages;
        this.totalElements = totalElements;
        this.first = first;
        this.numberOfElements = numberOfElements;
        this.last = last;
        this.content = content;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public void setContent(List<ENTITY> content) {
        this.content = content;
    }
}

package com.flab.book_challenge.book.controller;

import static com.flab.book_challenge.common.exception.ErrorStatus.BOOK_SORT_NOT_FOUND;

import com.flab.book_challenge.common.exception.GeneralException;
import org.springframework.data.domain.Sort;

public enum BookSortType {
    LATEST,
    PAGE_COUNT,
    BOOK_NAME;

    public static Sort getSort(BookSortType sortType) {
        return switch (sortType) {
            case LATEST -> Sort.by(Sort.Direction.DESC, "createdAt");
            case PAGE_COUNT -> Sort.by(Sort.Direction.DESC, "pageCount");
            case BOOK_NAME -> Sort.by(Sort.Direction.ASC, "name");
            default -> throw new GeneralException(BOOK_SORT_NOT_FOUND);
        };
    }
}

package com.flab.book_challenge.book.response;

import java.util.List;
import lombok.Builder;

@Builder
public record BooksPaginationOffsetResponse(
    int pageNumber,
    int size,
    long totalElementSize,
    int totalPageSize,
    boolean hasNext,
    List<BookDetailResponse> data
) {
}

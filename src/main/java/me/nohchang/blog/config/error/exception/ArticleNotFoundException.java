package me.nohchang.blog.config.error.exception;

import me.nohchang.blog.config.error.ErrorCode;

public class ArticleNotFoundException extends NotFoundException {

    public ArticleNotFoundException() {
        super(ErrorCode.ARTICLE_NOT_FOUND);
    }
}

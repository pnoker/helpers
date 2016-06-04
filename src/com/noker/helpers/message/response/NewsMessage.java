package com.noker.helpers.message.response;

import java.util.List;

import com.noker.helpers.message.model.Article;

/*文本消息*/
public class NewsMessage extends BaseMessage {
	private int ArticleCount;// 图文消息个数，限制为10条以内
	private List<Article> Articles;// 多条图文消息，默认为第一个item为大图

	public int getArticleCount() {
		return ArticleCount;
	}

	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}

	public List<Article> getArticles() {
		return Articles;
	}

	public void setArticles(List<Article> articles) {
		Articles = articles;
	}

}

package com.noker.helpers.message.response;

import java.util.List;

import com.noker.helpers.message.model.Article;

/*�ı���Ϣ*/
public class NewsMessage extends BaseMessage {
	private int ArticleCount;// ͼ����Ϣ����������Ϊ10������
	private List<Article> Articles;// ����ͼ����Ϣ��Ĭ��Ϊ��һ��itemΪ��ͼ

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

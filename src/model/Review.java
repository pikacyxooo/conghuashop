package model;
//评论表
public class Review {
	private String rid;//评论id
	private String uid;//用户id
	private String pid;//商品id
	private String title;//评论标题
	private String content;//评论内容
	private String time;//评论时间
	public Review(String rid, String uid, String pid) {
		super();
		this.rid = rid;
		this.uid = uid;
		this.pid = pid;
	}
	
}

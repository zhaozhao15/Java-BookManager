package com.zhao.model;
/**
 * 图书类别实体
 * @author zhao
 *
 */
public class BookType {
	private int id; // 编号
	private String bookTypeName; // 图书类别名称
	private String bookTypeDesc; // 备注
	
	public BookType() {
		super();
	}
	public BookType(String bookTypeName, String bookTypeDesc) {
		super();
		this.bookTypeName = bookTypeName;
		this.bookTypeDesc = bookTypeDesc;
	}
	public BookType(int id, String bookTypeName, String bookTypeDesc) {
		super();
		this.id = id;
		this.bookTypeName = bookTypeName;
		this.bookTypeDesc = bookTypeDesc;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookTypeName() {
		return bookTypeName;
	}
	public void setBookTypeName(String bookTypeName) {
		this.bookTypeName = bookTypeName;
	}
	public String getBookTypeDesc() {
		return bookTypeDesc;
	}
	public void setBookTypeDesc(String bookTypeDesc) {
		this.bookTypeDesc = bookTypeDesc;
	}
	
	/**
	 * 这样加入下拉框时显示的是名字而不是类
	 * 重写不是重载
	 */
	@Override
	public String toString() {
		return bookTypeName;
	}
}

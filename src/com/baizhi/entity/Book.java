package com.baizhi.entity;
import java.io.Serializable;
import java.util.Date;
public class Book implements Serializable{
	private String	id;       
	private String pname;             /*书名*/
	private String  author;/*作者*/
	private String cover;/*封面*/
	private String ISBN;     /*国际标准图书编号*/
	private double pricing;              /*定价 市场价*/
	private double sellingPrice;/*售价 当当价*/
	private int recommends;    /*推荐度*/
	private int salesVolume;          /*销售量*/
	private Date dateIssued;           /*上架时间*/
	private int grade;                /*顾客评分*/
	private String category_id;          /*所属分类*/
	private Category category;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String id, String pname, String author, String cover,
			String iSBN, double pricing, double sellingPrice, int recommends,
			int salesVolume, Date dateIssued, int grade, String category_id,
			Category category) {
		super();
		this.id = id;
		this.pname = pname;
		this.author = author;
		this.cover = cover;
		ISBN = iSBN;
		this.pricing = pricing;
		this.sellingPrice = sellingPrice;
		this.recommends = recommends;
		this.salesVolume = salesVolume;
		this.dateIssued = dateIssued;
		this.grade = grade;
		this.category_id = category_id;
		this.category = category;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public double getPricing() {
		return pricing;
	}
	public void setPricing(double pricing) {
		this.pricing = pricing;
	}
	public double getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public int getRecommends() {
		return recommends;
	}
	public void setRecommends(int recommends) {
		this.recommends = recommends;
	}
	public int getSalesVolume() {
		return salesVolume;
	}
	public void setSalesVolume(int salesVolume) {
		this.salesVolume = salesVolume;
	}
	public Date getDateIssued() {
		return dateIssued;
	}
	public void setDateIssued(Date dateIssued) {
		this.dateIssued = dateIssued;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", pname=" + pname + ", author=" + author
				+ ", cover=" + cover + ", ISBN=" + ISBN + ", pricing="
				+ pricing + ", sellingPrice=" + sellingPrice + ", recommends="
				+ recommends + ", salesVolume=" + salesVolume + ", dateIssued="
				+ dateIssued + ", grade=" + grade + ", category_id="
				+ category_id + ", category=" + category + "]";
	}
	
}
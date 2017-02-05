package org.java.hibernate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
@SecondaryTables({
    @SecondaryTable(name="name", pkJoinColumns={
        @PrimaryKeyJoinColumn(name="id", referencedColumnName="student_id") }),
    @SecondaryTable(name="address", pkJoinColumns={
        @PrimaryKeyJoinColumn(name="id", referencedColumnName="student_id") })
})
public class Student {
	@Id  @GeneratedValue @Column(name= "Id")
	private long id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Degree")
	private String degree;
	
	@Column(name="Roll_Num")
	private String roll;
	
	@Column(name="Ph_Num")
	private String phone;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", degree=" + degree + ", roll=" + roll + ", phone=" + phone
				+ "]";
	}
	
	

}

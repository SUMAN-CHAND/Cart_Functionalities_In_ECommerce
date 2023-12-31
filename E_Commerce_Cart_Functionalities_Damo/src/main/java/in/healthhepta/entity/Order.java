package in.healthhepta.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="order")
public class Order {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "id")
	    private Long id;

	    @ManyToOne(fetch = FetchType.EAGER)
	    @JoinColumn(name = "user_id")
	    private User user;

	    @ManyToOne(fetch = FetchType.EAGER)
	    @JoinColumn(name = "product_id")
	    private Product product;

	    @Column(name = "stock")
	    //@NotNull
	    private Integer stock;

	    @Column(name = "amount")
	    private Double amount;

	    @Column(name = "status")
	    private String status;

	    @Column(name = "date")
	    private Date date;
	    
//	    @Column(name = "totalAmount")
//	    private Double TotalAmount;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

//		public Double getTotalAmount() {
//			return TotalAmount;
//		}
//
//		public void setTotalAmount(Double totalAmount) {
//			TotalAmount = totalAmount;
//		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public Product getProduct() {
			return product;
		}

		public void setProduct(Product product) {
			this.product = product;
		}

		public Integer getStock() {
			return stock;
		}

		public void setStock(Integer stock) {
			this.stock = stock;
		}

		public Double getAmount() {
			return amount;
		}

		public void setAmount(Double amount) {
			this.amount = amount;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}
	    
}

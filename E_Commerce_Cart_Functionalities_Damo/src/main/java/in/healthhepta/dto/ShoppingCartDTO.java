package in.healthhepta.dto;

public class ShoppingCartDTO {
    private Long productId;
    private Integer stock;
    private String status;
    private Long uId;

    public Long getuId() {
		return uId;
	}

	public void setuId(Long uId) {
		this.uId = uId;
	}

	public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
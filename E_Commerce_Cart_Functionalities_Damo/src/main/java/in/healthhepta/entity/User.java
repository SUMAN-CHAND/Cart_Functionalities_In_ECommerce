package in.healthhepta.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String name;
    private String email;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private Set<ShoppingCart> shoppingCarts = new HashSet<>();
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private Set<Order> order = new HashSet<>();
    
    

    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public User(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
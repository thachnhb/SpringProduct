package net.springmvc;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
	// JpaRepository have 2 argument: T: type of domain model, ID: type of ID field
	// => Specify type of domain Entity class (Product) and type of its ID
	
	
}

package repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import model.entities.Product;

public abstract interface ProductRepository extends CrudRepository<Product, Long> {

	List<Product> findByBrandAndModelAndPrice(String brand, String model, float price);
	List<Product> findByBrandAndModel(String brand, String model);
}

package repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import model.entities.WheelRing;

public interface WheelRingRepository extends CrudRepository<WheelRing, Long> {

	List<WheelRing> findBySize(float size);
	List<WheelRing> findByRatios(int ratios);
}

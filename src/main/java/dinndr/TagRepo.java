package dinndr;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TagRepo extends CrudRepository<Tag, Long> {

	@Override
	public List<Tag> findAll();

	Tag findByTaste(String taste);

	Tag findByTasteContains(String substring);
}

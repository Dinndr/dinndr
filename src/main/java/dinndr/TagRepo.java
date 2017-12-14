package dinndr;

import org.springframework.data.repository.CrudRepository;


public interface TagRepo extends CrudRepository<Tag, Long> {

	Tag findByTaste(String taste);

	Tag findByTasteContains(String substring);
}

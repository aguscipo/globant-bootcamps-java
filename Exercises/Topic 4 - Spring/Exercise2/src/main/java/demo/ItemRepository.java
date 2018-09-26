package demo;

import java.util.Collection;

public interface ItemRepository {
	Collection<Item> getItems();
	Item getItem(Long id);
}

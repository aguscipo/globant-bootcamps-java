package demo;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;
@Service
public class ItemRepositoryImpl implements ItemRepository {
	private final AtomicLong idCounter = new AtomicLong();
	private Map<Long, Item> items;

	public ItemRepositoryImpl() {
		Item item1 = new Item(1, "item1", 100);
		Item item2 = new Item(2, "item2", 200);
		Item item3 = new Item(3, "item3", 300);

		items = new HashMap<Long, Item>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				put(idCounter.incrementAndGet(), item1);
				put(idCounter.incrementAndGet(), item2);
				put(idCounter.incrementAndGet(), item3);
			}
		};
	}

	public Collection<Item> getItems() {
		return items.values();
	}

	public Item getItem(Long id) {
		return items.get(id);
	}



}

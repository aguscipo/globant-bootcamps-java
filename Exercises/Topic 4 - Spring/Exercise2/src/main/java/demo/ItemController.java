package demo;


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ItemController {

    private ItemRepository repository;
    
    @Autowired
    public void setItemRepository(ItemRepository itemRepository) {
        this.repository = itemRepository;
    }


	@RequestMapping("/item/{id}")
    public Item getItem(@PathVariable Long id) {
    	return repository.getItem(id);

    }
    
    @RequestMapping("/items")
    public Collection<Item> getItems() {
    	return repository.getItems();
    }
}

package com.library.LibraryProject.business.abstracts;

import com.library.LibraryProject.entities.Category;
import com.library.LibraryProject.entities.Publisher;

public interface IPublisherService {
    Publisher getById(int id);
    Publisher save(Publisher publisher);
    void delete(Publisher publisher);
    Publisher update(Publisher publisher);
}

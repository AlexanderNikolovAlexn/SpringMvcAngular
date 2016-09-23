package com.samodeika.services;

import com.samodeika.models.Menu;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MenuService {

    List<Menu> getMenus();
}

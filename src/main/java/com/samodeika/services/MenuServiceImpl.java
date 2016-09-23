package com.samodeika.services;

import com.samodeika.models.Menu;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Override
    public List<Menu> getMenus() {
        List<Menu> result = new ArrayList<>();
        result.add(new Menu("Profile", "profile"));
        result.add(new Menu("Contact us", "contactus"));
        return result;
    }
}

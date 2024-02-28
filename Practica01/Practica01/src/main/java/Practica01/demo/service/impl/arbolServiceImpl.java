package Practica01.demo.service.impl;

import Practica01.demo.dao.arbolDao;
import Practica01.demo.domain.arbol;
import Practica01.demo.service.arbolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
class arbolServiceImpl implements arbolService { 

    @Autowired
    private arbolDao arbolDao;
    
    @Override    
    @Transactional(readOnly=true)
    public List<arbol> getarbol(boolean activos) {
        var lista=arbolDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
}
